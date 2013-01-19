package org.chw.proto;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

public class DomEditorConfig extends SourceViewerConfiguration
{
	private ITokenScanner scanner;

	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer)
	{
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		return reconciler;
	}

	public IContentAssistant getContentAssistant(ISourceViewer view)
	{
		ContentAssistant assistant = new ContentAssistant();
		
		assistant.setContentAssistProcessor(new DomContentAssistant(), IDocument.DEFAULT_CONTENT_TYPE);
		assistant.setAutoActivationDelay(100);
		assistant.enableAutoActivation(true);

		return assistant;

	}

	protected ITokenScanner getScanner()
	{
		if (scanner == null)
		{
			scanner = new DomTokenScanner();
		}
		return scanner;
	}
}
