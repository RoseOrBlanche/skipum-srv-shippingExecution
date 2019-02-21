/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncarrier.CarrierFeeds;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds}. This interface is used by {@link vdm.namespaces.comskipumcommoncarrier.field.CarrierFeedsField CarrierFeedsField} and {@link vdm.namespaces.comskipumcommoncarrier.link.CarrierFeedsLink CarrierFeedsLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds#ENABLED ENABLED}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds#FEED_CODE FEED_CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds#CARRIER_CODE CARRIER_CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds#PROVIDER_CODE PROVIDER_CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds#TO_FEED TO_FEED}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds#TO_CARRIER TO_CARRIER}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds#TO_PROVIDER TO_PROVIDER}</li>
 * </ul>
 * 
 */
public interface CarrierFeedsSelectable
    extends EntitySelectable<CarrierFeeds>
{


}
