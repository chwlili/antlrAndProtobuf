package org.chw.proto;

import org.antlr.runtime.CommonToken;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;


public class DomTokenScanner implements ITokenScanner
{
	private static IToken Import = new Token(new TextAttribute(new Color(Display.getCurrent(), new RGB(0xFF, 0, 0))));
	private static IToken Attribute = new Token(new TextAttribute(new Color(Display.getCurrent(), new RGB(0, 0, 0xff))));
	private static IToken Type = new Token(new TextAttribute(new Color(Display.getCurrent(), new RGB(0, 0xFF, 0))));
	private static IToken Default = new Token(new TextAttribute(new Color(Display.getCurrent(), new RGB(0x88, 0x88, 0x88))));
	private static IToken Normal = new Token(new TextAttribute(new Color(Display.getCurrent(), new RGB(0, 0, 0))));
	private static IToken Comment=new Token(new TextAttribute(new Color(Display.getCurrent(),new RGB(0xaa,0xaa,0xaa))));

	private DomTokenList list;
	private int offset=0;
	private CommonToken token;
	
	@Override
	public void setRange(IDocument document, int offset, int length)
	{
		this.list=DomManager.getTokenList(document);
		this.offset=offset;
		this.token=null;
	}

	@Override
	public IToken nextToken()
	{
		if(token==null)
		{
			token=list.getToken(offset);
		}
		else
		{
			token=list.getNextToken(token);
		}
		
		if(token==null || token.getType()==ExprLexer.EOF)
		{
			return Token.EOF;
		}
		
		switch(token.getType())
		{
			case ExprLexer.Package 	:
			case ExprLexer.Option	:
			case ExprLexer.Import 	:
			case ExprLexer.Message	:
			case ExprLexer.Enum		:	return Import;
			case ExprLexer.Attribute:	return Attribute;
			case ExprLexer.Type		:	return Type;
			case ExprLexer.Default	:	return Default;
			case ExprLexer.Comment	:	return Comment;
			default:
				return Normal;
		}
	}

	@Override
	public int getTokenOffset()
	{
		return token.getStartIndex();
	}

	@Override
	public int getTokenLength()
	{
		return token.getStopIndex()-token.getStartIndex()+1;
	}

}
