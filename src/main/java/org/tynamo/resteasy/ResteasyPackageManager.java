package org.tynamo.resteasy;

import java.util.Collection;

import org.apache.tapestry5.ioc.annotations.UsesConfiguration;

/**
 * Contains a set of contributed package names from which to load REST resources
 *
 * The service's configuration is the names of Java packages to search for REST resources.
 */
@UsesConfiguration(String.class)
public interface ResteasyPackageManager
{
	/**
	 * Returns packages from which read REST resource classes
	 * 
	 * @return Collection of package names
	 */
	Collection<String> getPackageNames();
}

