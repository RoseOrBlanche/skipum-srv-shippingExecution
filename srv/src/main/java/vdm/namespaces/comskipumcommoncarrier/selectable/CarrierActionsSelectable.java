/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncarrier.CarrierActions;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions}. This interface is used by {@link vdm.namespaces.comskipumcommoncarrier.field.CarrierActionsField CarrierActionsField} and {@link vdm.namespaces.comskipumcommoncarrier.link.CarrierActionsLink CarrierActionsLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierActions#ENABLED ENABLED}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierActions#ACTION_CODE_CODE ACTION_CODE_CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierActions#CARRIER_CODE CARRIER_CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierActions#PROVIDER_CODE PROVIDER_CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierActions#TO_ACTION_CODE TO_ACTION_CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierActions#TO_CARRIER TO_CARRIER}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierActions#TO_PROVIDER TO_PROVIDER}</li>
 * </ul>
 * 
 */
public interface CarrierActionsSelectable
    extends EntitySelectable<CarrierActions>
{


}
