/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncommon.WeightUnits;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits}. This interface is used by {@link vdm.namespaces.comskipumcommoncommon.field.WeightUnitsField WeightUnitsField} and {@link vdm.namespaces.comskipumcommoncommon.link.WeightUnitsLink WeightUnitsLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.WeightUnits#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.WeightUnits#CODE CODE}</li>
 * </ul>
 * 
 */
public interface WeightUnitsSelectable
    extends EntitySelectable<WeightUnits>
{


}
