/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncarrier.ContentActions;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions}. This interface is used by {@link vdm.namespaces.comskipumcommoncarrier.field.ContentActionsField ContentActionsField} and {@link vdm.namespaces.comskipumcommoncarrier.link.ContentActionsLink ContentActionsLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.ContentActions#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.ContentActions#CODE CODE}</li>
 * </ul>
 * 
 */
public interface ContentActionsSelectable
    extends EntitySelectable<ContentActions>
{


}
