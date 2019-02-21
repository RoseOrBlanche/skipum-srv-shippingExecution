/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncommon.VolumeUnits;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits}. This interface is used by {@link vdm.namespaces.comskipumcommoncommon.field.VolumeUnitsField VolumeUnitsField} and {@link vdm.namespaces.comskipumcommoncommon.link.VolumeUnitsLink VolumeUnitsLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.VolumeUnits#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.VolumeUnits#CODE CODE}</li>
 * </ul>
 * 
 */
public interface VolumeUnitsSelectable
    extends EntitySelectable<VolumeUnits>
{


}
