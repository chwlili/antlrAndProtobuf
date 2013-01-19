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
		CommonToken token=list.getToken(range.x);
		
		do
		{
			if(token.getType()==ExprLexer.Attribute)
			{
				//
				break;
			}
			else
			{
				
			}
		}
		while(token.getStartIndex()>0)
		{
			token=list.getToken(token.getStartIndex()-1);
		}
		
		// create proposals
		List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal>();
		//for(String var : variables) {
			proposals.add(new CompletionProposal("111", range.x, range.y, 3, null, "xx", null, "addtest"));
			proposals.add(new CompletionProposal("111", range.x, range.y, 3, null, "yy", null, "delooo"));
		//}
		return proposals.toArray(new ICompletionProposal[proposals.size()]);
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset)
	{
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters()
	{
		return new char[]{' ','\t','\n'};
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
