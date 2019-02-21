/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncarrier.ContentFeeds;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds}. This interface is used by {@link vdm.namespaces.comskipumcommoncarrier.field.ContentFeedsField ContentFeedsField} and {@link vdm.namespaces.comskipumcommoncarrier.link.ContentFeedsLink ContentFeedsLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds#CODE CODE}</li>
 * </ul>
 * 
 */
public interface ContentFeedsSelectable
    extends EntitySelectable<ContentFeeds>
{


}
