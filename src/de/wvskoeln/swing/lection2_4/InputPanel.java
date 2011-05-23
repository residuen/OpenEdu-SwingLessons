/*
Education-project: Swing-Basics lection 2.4

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

package de.wvskoeln.swing.lection2_4;

import java.awt.LayoutManager;

import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPanel extends JPanel
{
	private JTextField name = new JTextField("Name eingeben:");
	private JTextField firstname = new JTextField("Vorname eingeben:");
	private JTextField age = new JTextField("Alter eingeben:");
	
	/**
	 * Defaultkonstruktor, ruft super-Konstruktor und init-Methode auf
	 */
	public InputPanel()
	{
		super();
		
		init();
	}

	/**
	 * Konstruktor, ruft super-Konstruktor auf (legt dabei den Layoutmanager fest) und init-Methode
	 */
	public InputPanel(LayoutManager arg0)
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
//		setBorder(BorderFactory.createTitledBorder("Eingabe der Personendaten"));
		
		// Componenten dem Panel zuweisen
		initComponents();
	}
	
	/**
	 * Initialisieren der im Panel enthaltenen Komponenten
	 */
	private void initComponents()
	{
		// Groesse der Textfelder vorgeben
		name.setColumns(20);
		firstname.setColumns(20);
		age.setColumns(20);
		
		// Erzeuge eine vertikale Box, um Textfelder aufzunehmen
		Box vBox = Box.createVerticalBox();
		
		// Fuege der vBox die Textfelder name, firstname und age zu
		vBox.add(name);
		vBox.add(firstname);
		vBox.add(age);
		
		// die vBox mit den Textfelder in das Panel integrieren
		add(vBox);
	}
	
	/**
	 * Return the typed name
	 */
	public String getName()
	{
		return name.getText();
	}

	/**
	 * Return the typed firstname
	 */
	public String getFirstname()
	{
		return firstname.getText();
	}

	/**
	 * Return the typed age
	 */
	public int getAge()
	{
		return Integer.parseInt(age.getText()); // Converting String-value to an integer-value
	}
	
}
