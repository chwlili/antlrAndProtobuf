package org.chw.proto;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Point;

public class DomContentAssistant implements IContentAssistProcessor
{

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset)
	{
		// get document
		IDocument doc = viewer.getDocument();
		
		// get current selected range
		Point range = viewer.getSelectedRange();
		
		// get all declared variables
		//List<String> variables = TreeHelper.getVariables(tree);
		
		DomTokenList list=DomManager.getTokenList(viewer.getDocument());
		
		CommonToken curr=list.getToken(range.x);
		
		CommonToken token=curr;
		while(token.getType()==ExprLexer.Space || token.getType()==ExprLexer.Comment || token.getType()==ExprLexer.Semicolon)
		{
			token=list.getToken(token.getStartIndex()-1);
		}
		
		if(token!=null)
		{
			List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal>();
			
			if(token.getType()==ExprLexer.BraceL || token.getType()==ExprLexer.Index)
			{
				proposals.add(new CompletionProposal("required ", range.x, range.y, 9, null, "required", null, null));
				proposals.add(new CompletionProposal("optional ", range.x, range.y, 9, null, "optional", null, null));
				proposals.add(new CompletionProposal("repeated ", range.x, range.y, 9, null, "repeated", null, null));
			}
			else if(token.getType()==ExprLexer.Attribute)
			{
				proposals.add(new CompletionProposal("int32 ", range.x, range.y, 6, null, "int32", null, null));
				proposals.add(new CompletionProposal("sint32 ", range.x, range.y, 7, null, "sint32", null, null));
				proposals.add(new CompletionProposal("uint32 ", range.x, range.y, 7, null, "uint32", null, null));
				proposals.add(new CompletionProposal("int64 ", range.x, range.y, 6, null, "int64", null, null));
				proposals.add(new CompletionProposal("sint64 ", range.x, range.y, 7, null, "sint64", null, null));
				proposals.add(new CompletionProposal("uint64 ", range.x, range.y, 7, null, "uint64", null, null));
				proposals.add(new CompletionProposal("string ", range.x, range.y, 7, null, "string", null, null));
			}
			return proposals.toArray(new ICompletionProposal[proposals.size()]);
		}
		
		return null;
		// create proposals
		//for(String var : variables) {
		//}
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset)
	{
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters()
	{
		return new char[]{' ','\t','\r','\n'};
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters()
	{
		return null;
	}

	@Override
	public String getErrorMessage()
	{
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator()
	{
		return null;
	}

}
