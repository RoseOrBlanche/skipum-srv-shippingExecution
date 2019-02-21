/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.comskipumcommoncarrier.selectable.ServiceTypesSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class ServiceTypesByKeyFluentHelper
    extends FluentHelperByKey<ServiceTypesByKeyFluentHelper, ServiceTypes, ServiceTypesSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param code
     *     
     * @param servicePath
     *     Service path to be used to fetch a single {@code ServiceTypes}
     */
    public ServiceTypesByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String code) {
        super(servicePath);
        this.key.put("code", code);
    }

    @Override
    @Nonnull
    protected Class<ServiceTypes> getEntityClass() {
        return ServiceTypes.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
