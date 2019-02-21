/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.comskipumcommoncarrier.selectable.CarrierFeedsSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class CarrierFeedsByKeyFluentHelper
    extends FluentHelperByKey<CarrierFeedsByKeyFluentHelper, CarrierFeeds, CarrierFeedsSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param feed_code
     *     
     * @param servicePath
     *     Service path to be used to fetch a single {@code CarrierFeeds}
     * @param carrier_code
     *     
     */
    public CarrierFeedsByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String feed_code, final String carrier_code) {
        super(servicePath);
        this.key.put("feed_code", feed_code);
        this.key.put("carrier_code", carrier_code);
    }

    @Override
    @Nonnull
    protected Class<CarrierFeeds> getEntityClass() {
        return CarrierFeeds.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
