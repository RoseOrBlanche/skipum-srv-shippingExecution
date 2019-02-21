/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncarrier.ContentSources;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources}. This interface is used by {@link vdm.namespaces.comskipumcommoncarrier.field.ContentSourcesField ContentSourcesField} and {@link vdm.namespaces.comskipumcommoncarrier.link.ContentSourcesLink ContentSourcesLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.ContentSources#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.ContentSources#CODE CODE}</li>
 * </ul>
 * 
 */
public interface ContentSourcesSelectable
    extends EntitySelectable<ContentSources>
{


}
