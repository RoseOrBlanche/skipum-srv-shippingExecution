/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncommon.Countries;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncommon.Countries Countries}. This interface is used by {@link vdm.namespaces.comskipumcommoncommon.field.CountriesField CountriesField} and {@link vdm.namespaces.comskipumcommoncommon.link.CountriesLink CountriesLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.Countries#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.Countries#CODE CODE}</li>
 * </ul>
 * 
 */
public interface CountriesSelectable
    extends EntitySelectable<Countries>
{


}
