/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class CurrenciesDeleteFluentHelper
    extends FluentHelperDelete<CurrenciesDeleteFluentHelper, Currencies>
{

    /**
     * {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final Currencies entity;

    /**
     * Creates a fluent helper object that will delete a {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The Currencies to delete from the endpoint.
     */
    public CurrenciesDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final Currencies entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected Currencies getEntity() {
        return entity;
    }

}
