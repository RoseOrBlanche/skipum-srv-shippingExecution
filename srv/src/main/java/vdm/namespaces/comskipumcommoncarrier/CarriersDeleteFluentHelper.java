/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class CarriersDeleteFluentHelper
    extends FluentHelperDelete<CarriersDeleteFluentHelper, Carriers>
{

    /**
     * {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final Carriers entity;

    /**
     * Creates a fluent helper object that will delete a {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The Carriers to delete from the endpoint.
     */
    public CarriersDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final Carriers entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected Carriers getEntity() {
        return entity;
    }

}
