/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncarrier.ModeOfTransports;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports}. This interface is used by {@link vdm.namespaces.comskipumcommoncarrier.field.ModeOfTransportsField ModeOfTransportsField} and {@link vdm.namespaces.comskipumcommoncarrier.link.ModeOfTransportsLink ModeOfTransportsLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports#CODE CODE}</li>
 * </ul>
 * 
 */
public interface ModeOfTransportsSelectable
    extends EntitySelectable<ModeOfTransports>
{


}
