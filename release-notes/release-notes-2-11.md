<!-- SPDX-License-Identifier: CC-BY-4.0 -->
<!-- Copyright Contributors to the ODPi Egeria project. -->

# Release 2.11 (July 2021)

Release 2.11 adds:
* ???????

Details of these and other changes are in the sections that follow.

## Description of Changes

### Metadata Types


### Bug fixes and other updates
* Additional Bug Fixes
* Dependency Updates

For details on both see the commit history in GitHub.

## Removed Functionality

The following capabilities have now been removed (previously  deprecated and/or not in 'Released' status.
) :
* Information View OMAS.
* Virtualization Services & associated connectors.
* Security Officer Services, Security sync services & associated connectors including for Apache Ranger.
* Gaian database connector & additional authentication/impersonation support.
* Much of the above capability can be implemented via [Integration Services](https://egeria.odpi.org/open-metadata-implementation/integration-services/) .
* Hadoop specifics may be developed in the future within the [Egeria Hadoop](https://github.com/odpi/egeria-connector-hadoop-ecosystem) GitHub repository.
* For more details see [#5314](https://github.com/odpi/egeria/pull/5314) .
## Known Issues

* It is recommended to use a chromium-based browser such as Google Chrome or Microsoft Edge, or Apple Safari for the Egeria React UI. Some parts of the UI experience such as Dino currently experience problems with Firefox. See [odpi/egeria-react-ui#96](https://github.com/odpi/egeria-react-ui/issues/96) .
* When running the 'Understanding Platform Services' lab, ensure you run the 'egeria-service-config' notebook first and do not restart the python kernel before running this lab. See [#4842](https://github.com/odpi/egeria/issues/4842) .

# Egeria Implementation Status at Release 2.11

![Egeria Implementation Status](../open-metadata-publication/website/roadmap/functional-organization-showing-implementation-status-for-2.11.png#pagewidth)

Link to Egeria's [Roadmap](../open-metadata-publication/website/roadmap) for more details about the
Open Metadata and Governance vision, strategy and content.


# Further Help and Support

See the [Community Guide](../Community-Guide.md).

----
* Return to [Release Notes](.)
   
----
License: [CC BY 4.0](https://creativecommons.org/licenses/by/4.0/),
Copyright Contributors to the ODPi Egeria project.