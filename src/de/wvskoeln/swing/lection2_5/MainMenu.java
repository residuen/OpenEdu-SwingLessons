/*
Education-project: Swing-Basics lection 2.5

Copyright (C) 2011 Karsten Bettray

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License
as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
See the GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License along with this library;
if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110, USA
or look at <http://www.gnu.org/licenses/>.
*/

package de.wvskoeln.swing.lection2_5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Klasse MainMenu, bindet ein Menu in das Hauptfenster ein
 * @author bettray
 *
 */
public class MainMenu extends JMenuBar implements ActionListener
{
	private MainPanel mainPanel = null;	// Referenz aus mainpanels

	/**
	 * Konstruktor, erhaelt eine Referenz auf das MainPanel als Parameter
	 * @param mainPanel
	 */
	public MainMenu(MainPanel mainPanel)
	{
		super();
		
		this.mainPanel = mainPanel;	// Uebergibt eine Referenz des mainpanels an das Menu
		
		initComponents();			// Aufruf der Initialisierungsmethode
	}
	
	/**
	 * Initialisiert die Komponenten des Menues
	 */
	private void initComponents()
	{
		JMenu functions = new JMenu("Funktionen");	// Erstellen des Menues function
		JMenu help = new JMenu("Hilfe");			// Erstellen des Menues help
		help.setEnabled(false);						// Das Menu help auf inaktiv setzen
		
		JMenuItem hide = new JMenuItem("Ausblenden");	// Den Menueeintrag hide erstellen
		JMenuItem exit = new JMenuItem("Exit");			// Den Menueeintrag exit erstellen
		
		hide.addActionListener(this);		// dem Menueeintrag einen Beobachter fuer Ereignisse zuefuegen
		exit.addActionListener(this);		// dem Menueeintrag einen Beobachter fuer Ereignisse zuefuegen
		
		functions.add(hide);		// Den Menueeintrag hide dem Menue function zufuegen
		functions.addSeparator();	// Eine Separationslinie einfuegen
		functions.add(exit);		// Den Menueeintrag hide dem Menue function zufuegen
		
		add(functions);				// Das Menue function dem MenuBalken zufuegen
		add(help);					// Das Menue help dem MenuBalken zufuegen
	}

	/**
	 * Ereignissteuerung bei Maus-Klick-Event
	 */
 	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		System.out.println(arg0.getActionCommand());	// Klick-Aktion ausgeben
		
		if(arg0.getActionCommand().equals("Ausblenden"))	// Input-Komponenten des MainPanels wieder ausblenden
			mainPanel.setInputComponentsVisible(false);
		else
			if(arg0.getActionCommand().equals("Exit"))		// Programm beenden
				System.exit(0);
	}

}
