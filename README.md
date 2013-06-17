
Mark Jame's Flag icon set
-------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/countries](http://artifacts.griffon-framework.org/plugin/countries)


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

