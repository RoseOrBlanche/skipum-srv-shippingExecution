/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncommon.Regions;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncommon.Regions Regions}. This interface is used by {@link vdm.namespaces.comskipumcommoncommon.field.RegionsField RegionsField} and {@link vdm.namespaces.comskipumcommoncommon.link.RegionsLink RegionsLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.Regions#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.Regions#CODE CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.Regions#COUNTRY_CODE COUNTRY_CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.Regions#TO_COUNTRY TO_COUNTRY}</li>
 * </ul>
 * 
 */
public interface RegionsSelectable
    extends EntitySelectable<Regions>
{


}
