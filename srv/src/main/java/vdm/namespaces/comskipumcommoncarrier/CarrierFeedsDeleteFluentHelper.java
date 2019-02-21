/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class CarrierFeedsDeleteFluentHelper
    extends FluentHelperDelete<CarrierFeedsDeleteFluentHelper, CarrierFeeds>
{

    /**
     * {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final CarrierFeeds entity;

    /**
     * Creates a fluent helper object that will delete a {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The CarrierFeeds to delete from the endpoint.
     */
    public CarrierFeedsDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final CarrierFeeds entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected CarrierFeeds getEntity() {
        return entity;
    }

}
