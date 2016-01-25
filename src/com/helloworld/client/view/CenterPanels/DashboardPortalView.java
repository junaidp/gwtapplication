package com.helloworld.client.view.CenterPanels;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.DashboardPortalPresenter.Display;
import com.smartgwt.client.types.Alignment;  
import com.smartgwt.client.types.DragAppearance;  
import com.smartgwt.client.types.HeaderControls;  
import com.smartgwt.client.types.LayoutPolicy;  
import com.smartgwt.client.types.Overflow;  
import com.smartgwt.client.types.VerticalAlignment;  
import com.smartgwt.client.widgets.Canvas;  
import com.smartgwt.client.widgets.HeaderControl;  
import com.smartgwt.client.widgets.Label;  
import com.smartgwt.client.widgets.Window;  
import com.smartgwt.client.widgets.layout.HLayout;  
import com.smartgwt.client.widgets.layout.VLayout;  
import com.smartgwt.client.widgets.layout.VStack;  


public class DashboardPortalView extends Composite implements Display {

	private static DashboardPortalViewUiBinder uiBinder = GWT
			.create(DashboardPortalViewUiBinder.class);

	interface DashboardPortalViewUiBinder extends
			UiBinder<Widget, DashboardPortalView> {
	}
	
	@UiField 
	VerticalPanel container;
	
	public DashboardPortalView() {
		initWidget(uiBinder.createAndBindUi(this));
		
		
		 final PortalLayout portalLayout = new PortalLayout(1);  
	        portalLayout.setWidth(300);  
	        portalLayout.setHeight100();  
	        container.setWidth("1000px");
	  
	        // create portlets... 
	        for(int i=0; i<3 ; i++){
	            Portlet portlet = new Portlet();  
	            portlet.setTitle("Portlet "+i);  
	  
	            Label label = new Label();  
	            label.setAlign(Alignment.CENTER);  
	            label.setLayoutAlign(VerticalAlignment.CENTER);  
	            label.setContents("Portlet contents for portlet "+i);  
	            portlet.addItem(label);  
	            portalLayout.addPortlet(portlet);  
	        }
	      
	  
	        VLayout vLayout = new VLayout(15);  
	        vLayout.setMargin(10);  
	  
//	        final DynamicForm form = new DynamicForm();  
//	        form.setAutoWidth();  
//	        form.setNumCols(1);  
//	        final TextItem textPortletName = new TextItem();
//	        textPortletName.setTitle("Name");
//	        final ButtonItem addPortlet = new ButtonItem("addPortlet", "Add Portlet");  
//	        addPortlet.setStartRow(false);  
//	        addPortlet.setEndRow(false);  
//	        addPortlet.addClickHandler(new com.smartgwt.client.widgets.form.fields.events.ClickHandler() {  
//	            public void onClick(com.smartgwt.client.widgets.form.fields.events.ClickEvent event) {  
//	  
//	                final Portlet newPortlet = new Portlet();  
//	                newPortlet.setTitle(textPortletName.getValueAsString());  
//	  
//	                Label label = new Label();  
//	                label.setAlign(Alignment.CENTER);  
//	                label.setLayoutAlign(VerticalAlignment.CENTER);  
//	                label.setContents(textPortletName.getValueAsString()+" contents");  
//	                newPortlet.addItem(label);  
//	                newPortlet.setVisible(false);  
//	                PortalColumn column = portalLayout.addPortlet(newPortlet);  
//	                final LayoutSpacer placeHolder = new LayoutSpacer();  
//	                placeHolder.setRect(newPortlet.getRect());  
//	                column.addMember(placeHolder, 0); // add to top  
//	  
//	                // create an outline around the clicked button  
//	                final Canvas outline = new Canvas();  
//	                outline.setLeft(form.getAbsoluteLeft() + addPortlet.getLeft());  
//	                outline.setTop(form.getAbsoluteTop());  
//	                outline.setWidth(addPortlet.getWidth());  
//	                outline.setHeight(addPortlet.getHeight());  
//	                outline.setBorder("2px solid #8289A6");  
//	                outline.draw();  
//	                outline.bringToFront();  
//	  
//	                outline.animateRect(newPortlet.getPageLeft(), newPortlet.getPageTop(),  
//	                        newPortlet.getVisibleWidth(), newPortlet.getViewportHeight(),  
//	                        new AnimationCallback() {  
//	                            public void execute(boolean earlyFinish) {  
//	                                // callback at end of animation - destroy placeholder and outline; show the new portlet  
//	                                placeHolder.destroy();  
//	                                outline.destroy();  
//	                                newPortlet.show();  
//	                            }  
//	                        }, 750);  
//	            }  
//	        });  
//	  
//	  
//	        form.setItems(textPortletName);  
//	  
//	        vLayout.addMember(form);  
	        vLayout.addMember(portalLayout);  
	        container.add(vLayout);
	    }  
	  
	    /** 
	     * Portlet class definition 
	     */  
	    private class Portlet extends Window {  
	  
	        public Portlet() {  
	  
	            setShowShadow(false);  
	            setAnimateMinimize(true);  
	            setDragAppearance(DragAppearance.OUTLINE);  
	            setCanDrop(true);  
	            setHeaderControls(HeaderControls.MINIMIZE_BUTTON, HeaderControls.HEADER_LABEL, new HeaderControl(HeaderControl.SETTINGS), new HeaderControl(HeaderControl.HELP), HeaderControls.CLOSE_BUTTON);  
	  
	            // show either a shadow, or translucency, when dragging a portlet  
	            // (could do both at the same time, but these are not visually compatible effects)  
	            // setShowDragShadow(true);  
	            setDragOpacity(30);  
	  
	            // these settings enable the portlet to autosize its height only to fit its contents  
	            // (since width is determined from the containing layout, not the portlet contents)  
	            setVPolicy(LayoutPolicy.NONE);  
	            setOverflow(Overflow.VISIBLE);  
	        }  
	    }  
	  
	    /** 
	     * PortalColumn class definition 
	     */  
	    private class PortalColumn extends VStack {  
	  
	        public PortalColumn() {  
	  
	            // leave some space between portlets  
	            setMembersMargin(6);  
	  
	            // enable predefined component animation  
	            setAnimateMembers(true);  
	            setAnimateMemberTime(300);  
	  
	            // enable drop handling  
	            setCanAcceptDrop(true);  
	  
	            // change appearance of drag placeholder and drop indicator  
	            setDropLineThickness(4);  
	  
	            Canvas dropLineProperties = new Canvas();  
	            dropLineProperties.setBackgroundColor("aqua");  
	            setDropLineProperties(dropLineProperties);  
	  
	            setShowDragPlaceHolder(true);  
	  
	            Canvas placeHolderProperties = new Canvas();  
	            placeHolderProperties.setBorder("2px solid #8289A6");  
	            setPlaceHolderProperties(placeHolderProperties);  
	        }  
	    }  
	  
	    /** 
	     * PortalLayout class definition 
	     */  
	    private class PortalLayout extends HLayout {  
	        public PortalLayout(int numColumns) {  
	            setMembersMargin(6);  
	            for (int i = 0; i < numColumns; i++) {  
	                addMember(new PortalColumn());  
	            }  
	        }  
	  
	        public PortalColumn addPortlet(Portlet portlet) {  
	            // find the column with the fewest portlets  
	            int fewestPortlets = Integer.MAX_VALUE;  
	            PortalColumn fewestPortletsColumn = null;  
	            for (int i = 0; i < getMembers().length; i++) {  
	                int numPortlets = ((PortalColumn) getMember(i)).getMembers().length;  
	                if (numPortlets < fewestPortlets) {  
	                    fewestPortlets = numPortlets;  
	                    fewestPortletsColumn = (PortalColumn) getMember(i);  
	                }  
	            }  
	            fewestPortletsColumn.addMember(portlet);  
	            return fewestPortletsColumn;  
	        }  
	    }  
}
