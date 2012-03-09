/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres.Almiray
 */
class CountriesGriffonPlugin {
    // the plugin version
    String version = '0.3'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '0.9.5']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-countries-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = "Mark Jame's Flag icon set"
    String description = '''
Provides a shortcut for adding flag icons for all counties listed at [Wikipedia's ISO 3166-1 alpha-2 country codes][1].
Icons based on Mark Jame's [Flag icon collection][2].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*   | *Property* | *Type* | *Default*   | *Bindable* |
| -------- | ---------- | ------ | ----------- | ---------- |
| flagIcon | code       | String |             | no         |

Valid values for `code` can be obtained by running **flag-icon-selector** and inspecting the tooltip of the chosen icon;
`code` must be a valid RSS icon ISO 3166-1 alpha-2 country code

Country names are 18n aware. The default language is English, there are no additional language versions.
Provide a suitable `griffon.plugins.countries.countrynames_<locale>.properties` file for your Locale if
you wish to use a different translation for a Country name.

### Missing flags

The following country codes have no flags assigned to them because the Flag icon collection does not provide one.

 * AQ - Antartica
 * GG - Guernsey
 * IM - Isle of Man
 * JE - Jersey
 * SS - South Sudan

### Non-standard country names

This plugin assigns the following non standard country names to some additional flags found in the Flag icon set.
Be warned that these country codes are not sanctioned by ISO 3166-1 alpha-2.

 * CT - Catalonia
 * EN - England
 * EU - European Union
 * WL - Wales
 * XL - Scotland

Scripts
-------

 * **flag-icon-selector** - launches a window that displays all available icons (Hover an icon to see the icon name)

[1]: http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
[2]: http://www.famfamfam.com/lab/icons/flags/
'''
}
