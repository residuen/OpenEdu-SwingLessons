/*
Education-project: Swing-Basics lection 1.1

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

package de.wvskoeln.swing.lection1_1;

import javax.swing.JFrame;

/**
 * Erstellen eines Fensters durch erzeugen eines Objektes vom Typ JFrame
 * @author l_bettray
 *
 */
public class Start
{
	public Start()
	{
		// JFrame-Objekt Deklarieren und Initialisieren
		JFrame mFrame = new JFrame();
		
		// Verhalten vorgeben, wenn Fenster-Schliessend angeklickt wird
		mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Groesse des Fensters vorgeben
		mFrame.setSize(600, 600);
		
		// Fenstertitel vorgeben
		mFrame.setTitle("Das Hauptfenster");
		
		// "Standort" des Fensters festlegen
		mFrame.setLocation(50, 50);
		
		// Fenster sic// Objekt vom Typ Start erzeugen (Bewirkt aufruf des Konstruktors)htbar machen
		mFrame.setVisible(true);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Objekt vom Typ Start erzeugen (Bewirkt aufruf des Konstruktors)
		Start s = new Start();
	}

}
