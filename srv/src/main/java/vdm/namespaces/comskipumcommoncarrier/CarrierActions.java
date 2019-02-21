/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.odatav2.connectivity.ODataExceptionType;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQuery;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryBuilder;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryResult;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.ODataTypeValueSerializer;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;
import vdm.namespaces.comskipumcommoncarrier.field.CarrierActionsField;
import vdm.namespaces.comskipumcommoncarrier.link.CarrierActionsOneToOneLink;
import vdm.namespaces.comskipumcommoncarrier.selectable.CarrierActionsSelectable;


/**
 * <p>Original entity name from the Odata EDM: <b>CarrierActions</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CarrierActions
    extends VdmEntity<CarrierActions>
{

    /**
     * Selector for all available fields of CarrierActions.
     * 
     */
    public final static CarrierActionsSelectable ALL_FIELDS = new CarrierActionsSelectable() {


        @Nonnull
        @Override
        public String getFieldName() {
            return "*";
        }

        @Nonnull
        @Override
        public List<String> getSelections() {
            return Collections.singletonList("*");
        }

    }
    ;
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>enabled</b></p>
     * 
     * @param enabled
     *     
     */
    @SerializedName("enabled")
    @JsonProperty("enabled")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "enabled")
    private Boolean enabled;
    /**
     * Use with available fluent helpers to apply the <b>enabled</b> field to query operations.
     * 
     */
    public final static CarrierActionsField<Boolean> ENABLED = new CarrierActionsField<Boolean>("enabled");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>actionCode_code</b></p>
     * 
     * @param actionCode_code
     *     
     */
    @Key
    @SerializedName("actionCode_code")
    @JsonProperty("actionCode_code")
    @Nullable
    @ODataField(odataName = "actionCode_code")
    private String actionCode_code;
    /**
     * Use with available fluent helpers to apply the <b>actionCode_code</b> field to query operations.
     * 
     */
    public final static CarrierActionsField<String> ACTION_CODE_CODE = new CarrierActionsField<String>("actionCode_code");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>carrier_code</b></p>
     * 
     * @param carrier_code
     *     
     */
    @Key
    @SerializedName("carrier_code")
    @JsonProperty("carrier_code")
    @Nullable
    @ODataField(odataName = "carrier_code")
    private String carrier_code;
    /**
     * Use with available fluent helpers to apply the <b>carrier_code</b> field to query operations.
     * 
     */
    public final static CarrierActionsField<String> CARRIER_CODE = new CarrierActionsField<String>("carrier_code");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>provider_code</b></p>
     * 
     * @param provider_code
     *     
     */
    @SerializedName("provider_code")
    @JsonProperty("provider_code")
    @Nullable
    @ODataField(odataName = "provider_code")
    private String provider_code;
    /**
     * Use with available fluent helpers to apply the <b>provider_code</b> field to query operations.
     * 
     */
    public final static CarrierActionsField<String> PROVIDER_CODE = new CarrierActionsField<String>("provider_code");
    /**
     * Convienence field for reusing the same ERP system context with multiple queries (e.g. fetching associated entities).
     * 
     * @param erpConfigContext
     *     
     * @return
     *     The stored ERP system context for executing queries, or null if no such context has been set.
     */
    @JsonIgnore
    @Nullable
    private transient ErpConfigContext erpConfigContext;
    /**
     * Navigation property <b>actionCode</b> for <b>CarrierActions</b> to single <b>ContentActions</b>.
     * 
     */
    @SerializedName("actionCode")
    @JsonProperty("actionCode")
    @ODataField(odataName = "actionCode")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private ContentActions toActionCode;
    /**
     * Navigation property <b>carrier</b> for <b>CarrierActions</b> to single <b>Carriers</b>.
     * 
     */
    @SerializedName("carrier")
    @JsonProperty("carrier")
    @ODataField(odataName = "carrier")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Carriers toCarrier;
    /**
     * Navigation property <b>provider</b> for <b>CarrierActions</b> to single <b>ContentSources</b>.
     * 
     */
    @SerializedName("provider")
    @JsonProperty("provider")
    @ODataField(odataName = "provider")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private ContentSources toProvider;
    /**
     * Use with available fluent helpers to apply the <b>actionCode</b> navigation property to query operations.
     * 
     */
    public final static CarrierActionsOneToOneLink<ContentActions> TO_ACTION_CODE = new CarrierActionsOneToOneLink<ContentActions>("actionCode");
    /**
     * Use with available fluent helpers to apply the <b>carrier</b> navigation property to query operations.
     * 
     */
    public final static CarrierActionsOneToOneLink<Carriers> TO_CARRIER = new CarrierActionsOneToOneLink<Carriers>("carrier");
    /**
     * Use with available fluent helpers to apply the <b>provider</b> navigation property to query operations.
     * 
     */
    public final static CarrierActionsOneToOneLink<ContentSources> TO_PROVIDER = new CarrierActionsOneToOneLink<ContentSources>("provider");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<CarrierActions> getType() {
        return CarrierActions.class;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>enabled</b></p>
     * 
     * @param enabled
     *     
     */
    public void setEnabled(
        @Nullable
        final Boolean enabled) {
        rememberChangedField("Enabled", this.enabled);
        this.enabled = enabled;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>actionCode_code</b></p>
     * 
     * @param actionCode_code
     *     
     */
    public void setActionCode_code(
        @Nullable
        final String actionCode_code) {
        rememberChangedField("ActionCode_code", this.actionCode_code);
        this.actionCode_code = actionCode_code;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>carrier_code</b></p>
     * 
     * @param carrier_code
     *     
     */
    public void setCarrier_code(
        @Nullable
        final String carrier_code) {
        rememberChangedField("Carrier_code", this.carrier_code);
        this.carrier_code = carrier_code;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>provider_code</b></p>
     * 
     * @param provider_code
     *     
     */
    public void setProvider_code(
        @Nullable
        final String provider_code) {
        rememberChangedField("Provider_code", this.provider_code);
        this.provider_code = provider_code;
    }

    @Override
    protected String getEntityCollection() {
        return "CarrierActions";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("actionCode_code", getActionCode_code());
        result.put("carrier_code", getCarrier_code());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("enabled", getEnabled());
        values.put("actionCode_code", getActionCode_code());
        values.put("carrier_code", getCarrier_code());
        values.put("provider_code", getProvider_code());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("enabled")) {
                final Object value = values.remove("enabled");
                if ((value == null)||(!value.equals(getEnabled()))) {
                    setEnabled(((Boolean) value));
                }
            }
            if (values.containsKey("actionCode_code")) {
                final Object value = values.remove("actionCode_code");
                if ((value == null)||(!value.equals(getActionCode_code()))) {
                    setActionCode_code(((String) value));
                }
            }
            if (values.containsKey("carrier_code")) {
                final Object value = values.remove("carrier_code");
                if ((value == null)||(!value.equals(getCarrier_code()))) {
                    setCarrier_code(((String) value));
                }
            }
            if (values.containsKey("provider_code")) {
                final Object value = values.remove("provider_code");
                if ((value == null)||(!value.equals(getProvider_code()))) {
                    setProvider_code(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("actionCode")) {
                final Object value = (values).remove("actionCode");
                if (value instanceof Map) {
                    if (toActionCode == null) {
                        toActionCode = new ContentActions();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toActionCode.fromMap(inputMap);
                }
            }
            if ((values).containsKey("carrier")) {
                final Object value = (values).remove("carrier");
                if (value instanceof Map) {
                    if (toCarrier == null) {
                        toCarrier = new Carriers();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toCarrier.fromMap(inputMap);
                }
            }
            if ((values).containsKey("provider")) {
                final Object value = (values).remove("provider");
                if (value instanceof Map) {
                    if (toProvider == null) {
                        toProvider = new ContentSources();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toProvider.fromMap(inputMap);
                }
            }
        }
        super.fromMap(values);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    @Nonnull
    public static<T >CarrierActionsField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CarrierActionsField<T>(fieldName);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param typeConverter
     *     A TypeConverter<T, DomainT> instance whose first generic type matches the Java type of the field
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param <DomainT>
     *     The type of the extension field as returned by the OData service.
     * @return
     *     A representation of an extension field from this entity, holding a reference to the given TypeConverter.
     */
    @Nonnull
    public static<T,DomainT >CarrierActionsField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CarrierActionsField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfNavigationProperties() {
        final Map<String, Object> values = super.toMapOfNavigationProperties();
        if (toActionCode!= null) {
            (values).put("actionCode", toActionCode);
        }
        if (toCarrier!= null) {
            (values).put("carrier", toCarrier);
        }
        if (toProvider!= null) {
            (values).put("provider", toProvider);
        }
        return values;
    }

    /**
     * Fetches the <b>ContentActions</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>actionCode</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>ContentActions</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public ContentActions fetchActionCode()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type ContentActions.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("actionCode_code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(actionCode_code));
        odataResourceUrl.append(",carrier_code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(carrier_code));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("actionCode");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final ContentActions entity = result.as(ContentActions.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>ContentActions</b> entity (one to one). This corresponds to the OData navigation property <b>actionCode</b>.
     * <p>
     * If the navigation property <b>actionCode</b> of a queried <b>CarrierActions</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>ContentActions</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public ContentActions getActionCodeOrFetch()
        throws ODataException
    {
        if (toActionCode == null) {
            toActionCode = fetchActionCode();
        }
        return toActionCode;
    }

    /**
     * Retrieval of associated <b>ContentActions</b> entity (one to one). This corresponds to the OData navigation property <b>actionCode</b>.
     * <p>
     * If the navigation property for an entity <b>CarrierActions</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>actionCode</b> is already loaded, the result will contain the <b>ContentActions</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<ContentActions> getActionCodeIfPresent() {
        return Optional.ofNullable(toActionCode);
    }

    /**
     * Overwrites the associated <b>ContentActions</b> entity for the loaded navigation property <b>actionCode</b>.
     * 
     * @param value
     *     New <b>ContentActions</b> entity.
     */
    public void setActionCode(final ContentActions value) {
        toActionCode = value;
    }

    /**
     * Fetches the <b>Carriers</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>carrier</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>Carriers</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public Carriers fetchCarrier()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type Carriers.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("actionCode_code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(actionCode_code));
        odataResourceUrl.append(",carrier_code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(carrier_code));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("carrier");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final Carriers entity = result.as(Carriers.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>Carriers</b> entity (one to one). This corresponds to the OData navigation property <b>carrier</b>.
     * <p>
     * If the navigation property <b>carrier</b> of a queried <b>CarrierActions</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>Carriers</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public Carriers getCarrierOrFetch()
        throws ODataException
    {
        if (toCarrier == null) {
            toCarrier = fetchCarrier();
        }
        return toCarrier;
    }

    /**
     * Retrieval of associated <b>Carriers</b> entity (one to one). This corresponds to the OData navigation property <b>carrier</b>.
     * <p>
     * If the navigation property for an entity <b>CarrierActions</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>carrier</b> is already loaded, the result will contain the <b>Carriers</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<Carriers> getCarrierIfPresent() {
        return Optional.ofNullable(toCarrier);
    }

    /**
     * Overwrites the associated <b>Carriers</b> entity for the loaded navigation property <b>carrier</b>.
     * 
     * @param value
     *     New <b>Carriers</b> entity.
     */
    public void setCarrier(final Carriers value) {
        toCarrier = value;
    }

    /**
     * Fetches the <b>ContentSources</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>provider</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>ContentSources</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public ContentSources fetchProvider()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type ContentSources.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("actionCode_code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(actionCode_code));
        odataResourceUrl.append(",carrier_code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(carrier_code));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("provider");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final ContentSources entity = result.as(ContentSources.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>ContentSources</b> entity (one to one). This corresponds to the OData navigation property <b>provider</b>.
     * <p>
     * If the navigation property <b>provider</b> of a queried <b>CarrierActions</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>ContentSources</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public ContentSources getProviderOrFetch()
        throws ODataException
    {
        if (toProvider == null) {
            toProvider = fetchProvider();
        }
        return toProvider;
    }

    /**
     * Retrieval of associated <b>ContentSources</b> entity (one to one). This corresponds to the OData navigation property <b>provider</b>.
     * <p>
     * If the navigation property for an entity <b>CarrierActions</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>provider</b> is already loaded, the result will contain the <b>ContentSources</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<ContentSources> getProviderIfPresent() {
        return Optional.ofNullable(toProvider);
    }

    /**
     * Overwrites the associated <b>ContentSources</b> entity for the loaded navigation property <b>provider</b>.
     * 
     * @param value
     *     New <b>ContentSources</b> entity.
     */
    public void setProvider(final ContentSources value) {
        toProvider = value;
    }

    public final static class CarrierActionsBuilder {

        private ContentActions toActionCode;
        private Carriers toCarrier;
        private ContentSources toProvider;

        private CarrierActions.CarrierActionsBuilder toActionCode(ContentActions value) {
            toActionCode = value;
            return this;
        }

        /**
         * Navigation property <b>actionCode</b> for <b>CarrierActions</b> to single <b>ContentActions</b>.
         * 
         */
        @Nonnull
        public CarrierActions.CarrierActionsBuilder actionCode(final ContentActions value) {
            return toActionCode(value);
        }

        private CarrierActions.CarrierActionsBuilder toCarrier(Carriers value) {
            toCarrier = value;
            return this;
        }

        /**
         * Navigation property <b>carrier</b> for <b>CarrierActions</b> to single <b>Carriers</b>.
         * 
         */
        @Nonnull
        public CarrierActions.CarrierActionsBuilder carrier(final Carriers value) {
            return toCarrier(value);
        }

        private CarrierActions.CarrierActionsBuilder toProvider(ContentSources value) {
            toProvider = value;
            return this;
        }

        /**
         * Navigation property <b>provider</b> for <b>CarrierActions</b> to single <b>ContentSources</b>.
         * 
         */
        @Nonnull
        public CarrierActions.CarrierActionsBuilder provider(final ContentSources value) {
            return toProvider(value);
        }

    }

}
