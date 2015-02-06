//
// Copyright 2015 GOT5 (GO Tapestry 5)
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package org.got5.tapestry5.jquery.services;


import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ioc.Configuration;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.annotations.Contribute;
import org.apache.tapestry5.ioc.services.FactoryDefaults;
import org.apache.tapestry5.ioc.services.SymbolProvider;
import org.apache.tapestry5.services.LibraryMapping;
import org.got5.tapestry5.jquery.FoundationSymbolConstants;



public class FoundationModule {

	public static void contributeComponentClassResolver(
			Configuration<LibraryMapping> configuration) {
		configuration.add(new LibraryMapping("foundation",
				"org.got5.tapestry5.jquery"));
	}

	
	public static void contributeClasspathAssetAliasManager(
			MappedConfiguration<String, String> configuration) {
		configuration.add("tapestry-foundation", "META-INF/modules/foundation");
	}

	
	 @Contribute(SymbolProvider.class)
	 @FactoryDefaults
	 public static void setupSymbols(MappedConfiguration<String, Object> configuration)
	 {
	 
		 	configuration.add("foundation.asses.root", "classpath:META-INF/modules");
		 
	        configuration.add(FoundationSymbolConstants.FOUNDATION_ROOT, "${foundation.assets.root}/foundation");

	       
	    }
	
	
}
