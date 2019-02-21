/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class CountriesDeleteFluentHelper
    extends FluentHelperDelete<CountriesDeleteFluentHelper, Countries>
{

    /**
     * {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final Countries entity;

    /**
     * Creates a fluent helper object that will delete a {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The Countries to delete from the endpoint.
     */
    public CountriesDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final Countries entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected Countries getEntity() {
        return entity;
    }

}
