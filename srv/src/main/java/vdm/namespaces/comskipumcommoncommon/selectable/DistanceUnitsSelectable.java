/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncommon.DistanceUnits;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits}. This interface is used by {@link vdm.namespaces.comskipumcommoncommon.field.DistanceUnitsField DistanceUnitsField} and {@link vdm.namespaces.comskipumcommoncommon.link.DistanceUnitsLink DistanceUnitsLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.DistanceUnits#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.DistanceUnits#CODE CODE}</li>
 * </ul>
 * 
 */
public interface DistanceUnitsSelectable
    extends EntitySelectable<DistanceUnits>
{


}
