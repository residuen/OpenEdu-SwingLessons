/*
Education-project: Swing-Basics lection 1.5

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

package de.wvskoeln.swing.lection1_5;

import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Klasse MainPanel, wird durch Klasse JPanel erweitert (Siehe auch: Vererbung)
 * @author bettray
 *
 */
public class MainPanel extends JPanel
{
	/**
	 * Defaultkonstruktor, ruft super-Konstruktor und init-Methode auf
	 */
	public MainPanel()
	{
		super();
		
		init();
	}

	/**
	 * Konstruktor, ruft super-Konstruktor auf (legt dabei den Layoutmanager fest) und init-Methode
	 */
	public MainPanel(LayoutManager arg0)
	{
		super(arg0);
		
		init();
	}
	
	/**
	 * Initialisierung der Panel-Eigenschaften
	 */
	private void init()
	{
		// Kreieren eines Rahmens mit Titel
		setBorder(BorderFactory.createTitledBorder("Hauptframe mit Rahmen"));
		
		initComponents();
	}
	
	/**
	 * Initialisieren der im Panel enthaltenen Komponenten
	 */
	private void initComponents()
	{
		// Erzeugen von 2 Buttons, die Beschriftung der Buttons wird direkt dem Konstruktor uebergeben
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		
		// Erzeugen eines Textfeldes
		JTextField textfeld = new JTextField();
		// Groesse des Textfeldes vorgeben (0 ... n)
		textfeld.setColumns(20);
		
		add(button1);	// button1 zufuegen
		add(textfeld);	// textfeld zufuegen
		add(button2);	// button 2 zufuegen
	}
}
