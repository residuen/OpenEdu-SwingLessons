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

/**
 * Klasse: User
 * 	- Verwaltet Name, Vorname und Alter einer Person
 *  - Attribute werden ueber Getter- und Setter 
 */
public class User
{
	private String name = null;
	private String firstname = null;
	private int age = 0;
	
	/**
	 * Liefert Inhalt des name-Attributs zurueck
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Setzen des name-Attribut
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Liefert Inhalt des firstname-Attributs zurueck
	 * @return
	 */
	public String getFirstname()
	{
		return firstname;
	}
	
	/**
	 * Setzen des firstname-Attribut
	 */
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	
	/**
	 * Liefert Inhalt des age-Attributs zurueck
	 * @return
	 */
	public int getAge()
	{
		return age;
	}
	
	/**
	 * Setzen des age-Attribut
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
}
