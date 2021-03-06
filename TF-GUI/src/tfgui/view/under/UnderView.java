package tfgui.view.under;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
/*
* Copyright 2019 The Block-AI-VIsion Authors. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* ==========================================================================
*
* This file is part of Tensorflow GUI program under Block-AI-VIsion project.
*
* Made in University of Tasmania, Australia.
*
* @Authors : Dr.Mira Park (mira.park@utas.edu.au)
*	     Dr.Sanghee Lee (knusang1799@gmail.com)
*	     Heemoon Yoon (boguss1225@gmail.com)
*
* Date : Initial Development in 2019
*
* For the latest version, please check the github 
* (https://github.com/boguss1225/TF-GUI)
* 
* ==========================================================================
* Description : This program allows users to train models, configure settings,
*		detect objects and control image data within GUI level. 
*		This program converted almost every steps of Tensorflow model 
*		training into GUI so that user can easily utilize Tensorflow. 
*		To operate this program, server need to have preinstalled 
*		Tensorflow virtual environment and relevant script code.
*/
public class UnderView extends JPanel{
	private static final long serialVersionUID = 1L;
	private String ActivatedEnvName = "None";
	private JLabel southPanelLabel2;
	public UnderView(){
		this.setLayout(new BorderLayout());
		this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		JLabel southPanelLabel = new JLabel("Tensorflow for UTAS DI Server 2019");
		southPanelLabel2 = new JLabel("Virtual Env: "+ActivatedEnvName);
		southPanelLabel2.setForeground(Color.RED);
	 	
	 	this.add(southPanelLabel, BorderLayout.EAST);
	 	this.add(southPanelLabel2, BorderLayout.WEST);
	}
	public void setActivatedEnvName(String str){
		ActivatedEnvName = str;
		southPanelLabel2.setText("Virtual Env: "+ActivatedEnvName);
		southPanelLabel2.setForeground(Color.GREEN);
	}
	public void UpdatePath(String path){
		southPanelLabel2.setText("Virtual Env: "+ActivatedEnvName+ " " + path);
		southPanelLabel2.setForeground(Color.GREEN);
	}
}
