/*
 * Created on 27-Apr-2004
 * Created by Paul Gardner
 * Copyright (C) Azureus Software, Inc, All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 */

package torrentlib.data.html;

/**
 * @author parg
 *
 */

import torrentlib.data.html.HTMLPageImpl;
import java.io.*;

public class 
HTMLPageFactory 
{
	public static HTMLPage
	loadPage(
		InputStream		is )
	
		throws HTMLException
	{
		return( loadPage( is, true ));
	}
	
	public static HTMLPage
	loadPage(
		InputStream		is,
		String			charset )
	
		throws HTMLException
	{
		return( loadPage( is, charset, true ));
	}
	
	public static HTMLPage
	loadPage(
		InputStream		is,
		boolean			close_file )
	
		throws HTMLException
	{
		return(loadPage( is, null, close_file ));
	}
	
	public static HTMLPage
	loadPage(
		InputStream		is,
		String			charset,
		boolean			close_file )
	
		throws HTMLException
	{
		return( new HTMLPageImpl( is, charset, close_file ));
	}
}