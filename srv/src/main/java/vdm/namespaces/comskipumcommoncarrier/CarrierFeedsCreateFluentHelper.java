/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperCreate;


/**
 * Fluent helper to create a new {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class CarrierFeedsCreateFluentHelper
    extends FluentHelperCreate<CarrierFeedsCreateFluentHelper, CarrierFeeds>
{

    /**
     * {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity object that will be created in the S/4HANA system.
     * 
     */
    private final CarrierFeeds entity;

    /**
     * Creates a fluent helper object that will create a {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the create requests to.
     * @param entity
     *     The CarrierFeeds to create.
     */
    public CarrierFeedsCreateFluentHelper(
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
