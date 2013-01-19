package org.chw.proto;

import java.util.Hashtable;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;

public class DomManager
{
	private static ExprLexer lexer=new ExprLexer();
	private static ExprParser parser=null;
	
	private static Hashtable<IDocument, DomTokenList> docs=new Hashtable<IDocument, DomTokenList>(); 
	
	public static DomTokenList getTokenList(IDocument doc)
	{
		DomTokenList list=docs.get(doc);
		if(list==null)
		{
			lexer.setCharStream(new ANTLRStringStream(doc.get()));
			CommonTokenStream tokenStream=new CommonTokenStream(lexer);
			
			parser = new ExprParser(tokenStream);
			CommonTree result;
			try
			{
				result = (CommonTree)(parser.proto().getTree());
			
				//printMsg(result);
				
				CommonTreeNodeStream treeNodes=new CommonTreeNodeStream(result);
				treeNodes.setTokenStream(tokenStream);
				
				ExprWalk treeParser=new ExprWalk(treeNodes);
				treeParser.proto();
			}
			catch (RecognitionException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			list=new DomTokenList();
			list.setTokenList((List<CommonToken>)tokenStream.getTokens());
			docs.put(doc, list);
		}
		
		return list;
	}
	
	public static void unregisterDocument(IDocument doc)
	{
		docs.remove(doc);
	}
	
	public static void registerDocument(final IDocument doc)
	{
		doc.addDocumentListener(new IDocumentListener()
		{
			
			@Override
			public void documentChanged(DocumentEvent event)
			{
				docs.remove(doc);
			}
			
			@Override
			public void documentAboutToBeChanged(DocumentEvent event)
			{
				
			}
		});
	}
}
