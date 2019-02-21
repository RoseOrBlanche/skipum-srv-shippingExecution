/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class WeightUnitsDeleteFluentHelper
    extends FluentHelperDelete<WeightUnitsDeleteFluentHelper, WeightUnits>
{

    /**
     * {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final WeightUnits entity;

    /**
     * Creates a fluent helper object that will delete a {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The WeightUnits to delete from the endpoint.
     */
    public WeightUnitsDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final WeightUnits entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected WeightUnits getEntity() {
        return entity;
    }

}
