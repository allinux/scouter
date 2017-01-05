/*
 *  Copyright 2016 the original author or authors. 
 *  @https://github.com/scouter-project/scouter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 */
package scouter.client.stack.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

import scouter.client.stack.views.XMLEditorView;

public class OpenXMLEditorAction extends Action {
	public final static String ID = OpenXMLEditorAction.class.getName();

	private IWorkbenchWindow m_window;
	
	public OpenXMLEditorAction(IWorkbenchWindow window, String label, ImageDescriptor imageDescriptor) {
		super(label, imageDescriptor);
		this.setId(ID);
		m_window = window;
	}
	
	public void run(){
		if (m_window != null) {
			try {
				m_window.getActivePage().showView(XMLEditorView.ID);
			} catch (PartInitException ex) {
				ex.printStackTrace();
			}
		}
	}
}