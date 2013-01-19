package org.chw.proto;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class DomEditor
{

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args)
	{
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		FillLayout layout=new FillLayout();
		layout.marginWidth=10;
		layout.marginHeight=10;
		shell.setLayout(layout);
		
		SourceViewer viewer=new SourceViewer(shell, null,  SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		viewer.getTextWidget().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.getTextWidget().setFont(JFaceResources.getFont(JFaceResources.TEXT_FONT));
		
		// set doc and partitioner
		IDocument doc = new Document();	
		
		IDocumentPartitioner partitioner = new FastPartitioner(new RuleBasedPartitionScanner(), new String[0]);
		partitioner.connect(doc);
		doc.setDocumentPartitioner(partitioner);
		viewer.setDocument(doc);
		
		// configure viewer
		viewer.configure(new DomEditorConfig());


		// initialize
		DomManager.registerDocument(doc);
		DomManager.registerDocument(doc);
		
		shell.open();
		
		shell.layout();
		while (!shell.isDisposed())
		{
			if (!display.readAndDispatch())
			{
				display.sleep();
			}
		}
	}
}
