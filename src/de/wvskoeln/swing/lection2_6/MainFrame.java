/*
Education-project: Swing-Basics lection 2.6

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

package de.wvskoeln.swing.lection2_6;

import javax.swing.JFrame;

/**
 * Klasse MainFrame, wird durch Klasse JFrame erweitert (Siehe auch: Vererbung)
 * @author l_bettray
 *
 */
public class MainFrame extends JFrame
{
	MainPanel mainPanel = new MainPanel();

	/**
	 * Defaultkonstruktor, ruft super-Konstruktor und init-Methode auf
	 */
	public MainFrame()
	{
		super();
		init();
	}

	/**
	 * Konstruktor, ruft super-Konstruktor auf (setzt den Fensternamen fest) und init-Methode
	 */
	public MainFrame(String arg0)
	{
		super(arg0);
		init();
	}
	
	/**
	 * Stellt die Eigenschaften des Hauptfensters ein
	 */
	private void init()
	{
		// Ein Objekt eines Menue-Balkens erzeugen und diesem eine Referenz auf das MainPanel uebergeben
		MainMenu menubar = new MainMenu(mainPanel);
		
		// Verhalten vorgeben, wenn Fenster-Schliessend angeklickt wird
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Groesse des Fensters vorgeben
		setSize(600, 600);
		
		// Fenstertitel vorgeben
		setTitle("Das Hauptfenster");
		
		// "Standort" des Fensters festlegen
		setLocation(50, 50);
		
		// Enthaltene Komponenten intialisieren
		initComponents();
		
		// Menu-Objekt dem Fenster zufuegen
		setJMenuBar(menubar);
		
		// Fenster sichtbar machen
		setVisible(true);
	}
	
	private void initComponents()
	{
		add(mainPanel);
	}
	
}
