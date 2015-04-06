/*
 * This file is part of Network Spoofer for Android.
 * Network Spoofer lets you change websites on other people’s computers
 * from an Android phone.
 * Copyright (C) 2011 Will Shackleton
 *
 * Network Spoofer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Network Spoofer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Network Spoofer, in the file COPYING.
 * If not, see <http://www.gnu.org/licenses/>.
 */

package uk.digitalsquid.netspoofer.config;

/**
 * Global config of variables etc..
 * @author william
 *
 */
public interface Config extends LogConf {
	public static final String DEB_IMG = "img/debian.img";
	public static final String DEB_IMG_GZ = "img/debian.img.gz";
	public static final String DEB_VERSION_FILE = "img/version";
	public static final String SF_DEB_IMG_URL = "http://sourceforge.net/projects/netspoof/files/debian-images/debian-0.8.2.img.gz/download";
	public static final String SF_DEB_IMG_URL_NOZIP = "http://sourceforge.net/projects/netspoof/files/debian-images/debian-0.8.2.img/download";
	
	/**
	 * For incremental upgrades
	 */
	public static final String UPGRADE_URI_FORMAT = "http://sourceforge.net/projects/netspoof/files/update/%d-%d.zip/download";
	// public static final String UPGRADE_URI_FORMAT = "http://digitalsquid.co.uk/download/android-netspoof/upgrade/%d-%d.zip";
	public static final String UPGRADE_URI_FAIL = "http://sourceforge.net/projects/netspoof/files/";
	
	public static final int DEB_IMG_URL_SIZE = 440320000;
	public static final int DEB_IMG_URL_VERSION = 13;
}
