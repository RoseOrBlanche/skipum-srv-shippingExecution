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
import vdm.namespaces.comskipumcommoncarrier.field.ServicesField;
import vdm.namespaces.comskipumcommoncarrier.link.ServicesOneToOneLink;
import vdm.namespaces.comskipumcommoncarrier.selectable.ServicesSelectable;


/**
 * <p>Original entity name from the Odata EDM: <b>Services</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class Services
    extends VdmEntity<Services>
{

    /**
     * Selector for all available fields of Services.
     * 
     */
    public final static ServicesSelectable ALL_FIELDS = new ServicesSelectable() {


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
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>name</b></p>
     * 
     * @param name
     *     
     */
    @SerializedName("name")
    @JsonProperty("name")
    @Nullable
    @ODataField(odataName = "name")
    private String name;
    /**
     * Use with available fluent helpers to apply the <b>name</b> field to query operations.
     * 
     */
    public final static ServicesField<String> NAME = new ServicesField<String>("name");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>code</b></p>
     * 
     * @param code
     *     
     */
    @Key
    @SerializedName("code")
    @JsonProperty("code")
    @Nullable
    @ODataField(odataName = "code")
    private String code;
    /**
     * Use with available fluent helpers to apply the <b>code</b> field to query operations.
     * 
     */
    public final static ServicesField<String> CODE = new ServicesField<String>("code");
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
    public final static ServicesField<Boolean> ENABLED = new ServicesField<Boolean>("enabled");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>modeOfTransport_code</b></p>
     * 
     * @param modeOfTransport_code
     *     
     */
    @SerializedName("modeOfTransport_code")
    @JsonProperty("modeOfTransport_code")
    @Nullable
    @ODataField(odataName = "modeOfTransport_code")
    private String modeOfTransport_code;
    /**
     * Use with available fluent helpers to apply the <b>modeOfTransport_code</b> field to query operations.
     * 
     */
    public final static ServicesField<String> MODE_OF_TRANSPORT_CODE = new ServicesField<String>("modeOfTransport_code");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>serviceType_code</b></p>
     * 
     * @param serviceType_code
     *     
     */
    @SerializedName("serviceType_code")
    @JsonProperty("serviceType_code")
    @Nullable
    @ODataField(odataName = "serviceType_code")
    private String serviceType_code;
    /**
     * Use with available fluent helpers to apply the <b>serviceType_code</b> field to query operations.
     * 
     */
    public final static ServicesField<String> SERVICE_TYPE_CODE = new ServicesField<String>("serviceType_code");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>serviceSubType_code</b></p>
     * 
     * @param serviceSubType_code
     *     
     */
    @SerializedName("serviceSubType_code")
    @JsonProperty("serviceSubType_code")
    @Nullable
    @ODataField(odataName = "serviceSubType_code")
    private String serviceSubType_code;
    /**
     * Use with available fluent helpers to apply the <b>serviceSubType_code</b> field to query operations.
     * 
     */
    public final static ServicesField<String> SERVICE_SUB_TYPE_CODE = new ServicesField<String>("serviceSubType_code");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>carrier_code</b></p>
     * 
     * @param carrier_code
     *     
     */
    @SerializedName("carrier_code")
    @JsonProperty("carrier_code")
    @Nullable
    @ODataField(odataName = "carrier_code")
    private String carrier_code;
    /**
     * Use with available fluent helpers to apply the <b>carrier_code</b> field to query operations.
     * 
     */
    public final static ServicesField<String> CARRIER_CODE = new ServicesField<String>("carrier_code");
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
     * Navigation property <b>modeOfTransport</b> for <b>Services</b> to single <b>ModeOfTransports</b>.
     * 
     */
    @SerializedName("modeOfTransport")
    @JsonProperty("modeOfTransport")
    @ODataField(odataName = "modeOfTransport")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private ModeOfTransports toModeOfTransport;
    /**
     * Navigation property <b>serviceType</b> for <b>Services</b> to single <b>ServiceTypes</b>.
     * 
     */
    @SerializedName("serviceType")
    @JsonProperty("serviceType")
    @ODataField(odataName = "serviceType")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private ServiceTypes toServiceType;
    /**
     * Navigation property <b>serviceSubType</b> for <b>Services</b> to single <b>ServiceSubTypes</b>.
     * 
     */
    @SerializedName("serviceSubType")
    @JsonProperty("serviceSubType")
    @ODataField(odataName = "serviceSubType")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private ServiceSubTypes toServiceSubType;
    /**
     * Navigation property <b>carrier</b> for <b>Services</b> to single <b>Carriers</b>.
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
     * Use with available fluent helpers to apply the <b>modeOfTransport</b> navigation property to query operations.
     * 
     */
    public final static ServicesOneToOneLink<ModeOfTransports> TO_MODE_OF_TRANSPORT = new ServicesOneToOneLink<ModeOfTransports>("modeOfTransport");
    /**
     * Use with available fluent helpers to apply the <b>serviceType</b> navigation property to query operations.
     * 
     */
    public final static ServicesOneToOneLink<ServiceTypes> TO_SERVICE_TYPE = new ServicesOneToOneLink<ServiceTypes>("serviceType");
    /**
     * Use with available fluent helpers to apply the <b>serviceSubType</b> navigation property to query operations.
     * 
     */
    public final static ServicesOneToOneLink<ServiceSubTypes> TO_SERVICE_SUB_TYPE = new ServicesOneToOneLink<ServiceSubTypes>("serviceSubType");
    /**
     * Use with available fluent helpers to apply the <b>carrier</b> navigation property to query operations.
     * 
     */
    public final static ServicesOneToOneLink<Carriers> TO_CARRIER = new ServicesOneToOneLink<Carriers>("carrier");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<Services> getType() {
        return Services.class;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>name</b></p>
     * 
     * @param name
     *     
     */
    public void setName(
        @Nullable
        final String name) {
        rememberChangedField("Name", this.name);
        this.name = name;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>code</b></p>
     * 
     * @param code
     *     
     */
    public void setCode(
        @Nullable
        final String code) {
        rememberChangedField("Code", this.code);
        this.code = code;
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
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>modeOfTransport_code</b></p>
     * 
     * @param modeOfTransport_code
     *     
     */
    public void setModeOfTransport_code(
        @Nullable
        final String modeOfTransport_code) {
        rememberChangedField("ModeOfTransport_code", this.modeOfTransport_code);
        this.modeOfTransport_code = modeOfTransport_code;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>serviceType_code</b></p>
     * 
     * @param serviceType_code
     *     
     */
    public void setServiceType_code(
        @Nullable
        final String serviceType_code) {
        rememberChangedField("ServiceType_code", this.serviceType_code);
        this.serviceType_code = serviceType_code;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>serviceSubType_code</b></p>
     * 
     * @param serviceSubType_code
     *     
     */
    public void setServiceSubType_code(
        @Nullable
        final String serviceSubType_code) {
        rememberChangedField("ServiceSubType_code", this.serviceSubType_code);
        this.serviceSubType_code = serviceSubType_code;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>carrier_code</b></p>
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

    @Override
    protected String getEntityCollection() {
        return "Services";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("code", getCode());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("name", getName());
        values.put("code", getCode());
        values.put("enabled", getEnabled());
        values.put("modeOfTransport_code", getModeOfTransport_code());
        values.put("serviceType_code", getServiceType_code());
        values.put("serviceSubType_code", getServiceSubType_code());
        values.put("carrier_code", getCarrier_code());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("name")) {
                final Object value = values.remove("name");
                if ((value == null)||(!value.equals(getName()))) {
                    setName(((String) value));
                }
            }
            if (values.containsKey("code")) {
                final Object value = values.remove("code");
                if ((value == null)||(!value.equals(getCode()))) {
                    setCode(((String) value));
                }
            }
            if (values.containsKey("enabled")) {
                final Object value = values.remove("enabled");
                if ((value == null)||(!value.equals(getEnabled()))) {
                    setEnabled(((Boolean) value));
                }
            }
            if (values.containsKey("modeOfTransport_code")) {
                final Object value = values.remove("modeOfTransport_code");
                if ((value == null)||(!value.equals(getModeOfTransport_code()))) {
                    setModeOfTransport_code(((String) value));
                }
            }
            if (values.containsKey("serviceType_code")) {
                final Object value = values.remove("serviceType_code");
                if ((value == null)||(!value.equals(getServiceType_code()))) {
                    setServiceType_code(((String) value));
                }
            }
            if (values.containsKey("serviceSubType_code")) {
                final Object value = values.remove("serviceSubType_code");
                if ((value == null)||(!value.equals(getServiceSubType_code()))) {
                    setServiceSubType_code(((String) value));
                }
            }
            if (values.containsKey("carrier_code")) {
                final Object value = values.remove("carrier_code");
                if ((value == null)||(!value.equals(getCarrier_code()))) {
                    setCarrier_code(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("modeOfTransport")) {
                final Object value = (values).remove("modeOfTransport");
                if (value instanceof Map) {
                    if (toModeOfTransport == null) {
                        toModeOfTransport = new ModeOfTransports();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toModeOfTransport.fromMap(inputMap);
                }
            }
            if ((values).containsKey("serviceType")) {
                final Object value = (values).remove("serviceType");
                if (value instanceof Map) {
                    if (toServiceType == null) {
                        toServiceType = new ServiceTypes();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toServiceType.fromMap(inputMap);
                }
            }
            if ((values).containsKey("serviceSubType")) {
                final Object value = (values).remove("serviceSubType");
                if (value instanceof Map) {
                    if (toServiceSubType == null) {
                        toServiceSubType = new ServiceSubTypes();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toServiceSubType.fromMap(inputMap);
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
    public static<T >ServicesField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new ServicesField<T>(fieldName);
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
    public static<T,DomainT >ServicesField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new ServicesField<T>(fieldName, typeConverter);
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
        if (toModeOfTransport!= null) {
            (values).put("modeOfTransport", toModeOfTransport);
        }
        if (toServiceType!= null) {
            (values).put("serviceType", toServiceType);
        }
        if (toServiceSubType!= null) {
            (values).put("serviceSubType", toServiceSubType);
        }
        if (toCarrier!= null) {
            (values).put("carrier", toCarrier);
        }
        return values;
    }

    /**
     * Fetches the <b>ModeOfTransports</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>modeOfTransport</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>ModeOfTransports</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public ModeOfTransports fetchModeOfTransport()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type ModeOfTransports.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(code));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("modeOfTransport");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final ModeOfTransports entity = result.as(ModeOfTransports.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>ModeOfTransports</b> entity (one to one). This corresponds to the OData navigation property <b>modeOfTransport</b>.
     * <p>
     * If the navigation property <b>modeOfTransport</b> of a queried <b>Services</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>ModeOfTransports</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public ModeOfTransports getModeOfTransportOrFetch()
        throws ODataException
    {
        if (toModeOfTransport == null) {
            toModeOfTransport = fetchModeOfTransport();
        }
        return toModeOfTransport;
    }

    /**
     * Retrieval of associated <b>ModeOfTransports</b> entity (one to one). This corresponds to the OData navigation property <b>modeOfTransport</b>.
     * <p>
     * If the navigation property for an entity <b>Services</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>modeOfTransport</b> is already loaded, the result will contain the <b>ModeOfTransports</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<ModeOfTransports> getModeOfTransportIfPresent() {
        return Optional.ofNullable(toModeOfTransport);
    }

    /**
     * Overwrites the associated <b>ModeOfTransports</b> entity for the loaded navigation property <b>modeOfTransport</b>.
     * 
     * @param value
     *     New <b>ModeOfTransports</b> entity.
     */
    public void setModeOfTransport(final ModeOfTransports value) {
        toModeOfTransport = value;
    }

    /**
     * Fetches the <b>ServiceTypes</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>serviceType</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>ServiceTypes</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public ServiceTypes fetchServiceType()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type ServiceTypes.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(code));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("serviceType");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final ServiceTypes entity = result.as(ServiceTypes.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>ServiceTypes</b> entity (one to one). This corresponds to the OData navigation property <b>serviceType</b>.
     * <p>
     * If the navigation property <b>serviceType</b> of a queried <b>Services</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>ServiceTypes</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public ServiceTypes getServiceTypeOrFetch()
        throws ODataException
    {
        if (toServiceType == null) {
            toServiceType = fetchServiceType();
        }
        return toServiceType;
    }

    /**
     * Retrieval of associated <b>ServiceTypes</b> entity (one to one). This corresponds to the OData navigation property <b>serviceType</b>.
     * <p>
     * If the navigation property for an entity <b>Services</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>serviceType</b> is already loaded, the result will contain the <b>ServiceTypes</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<ServiceTypes> getServiceTypeIfPresent() {
        return Optional.ofNullable(toServiceType);
    }

    /**
     * Overwrites the associated <b>ServiceTypes</b> entity for the loaded navigation property <b>serviceType</b>.
     * 
     * @param value
     *     New <b>ServiceTypes</b> entity.
     */
    public void setServiceType(final ServiceTypes value) {
        toServiceType = value;
    }

    /**
     * Fetches the <b>ServiceSubTypes</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>serviceSubType</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>ServiceSubTypes</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public ServiceSubTypes fetchServiceSubType()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type ServiceSubTypes.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(code));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("serviceSubType");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final ServiceSubTypes entity = result.as(ServiceSubTypes.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>ServiceSubTypes</b> entity (one to one). This corresponds to the OData navigation property <b>serviceSubType</b>.
     * <p>
     * If the navigation property <b>serviceSubType</b> of a queried <b>Services</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>ServiceSubTypes</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public ServiceSubTypes getServiceSubTypeOrFetch()
        throws ODataException
    {
        if (toServiceSubType == null) {
            toServiceSubType = fetchServiceSubType();
        }
        return toServiceSubType;
    }

    /**
     * Retrieval of associated <b>ServiceSubTypes</b> entity (one to one). This corresponds to the OData navigation property <b>serviceSubType</b>.
     * <p>
     * If the navigation property for an entity <b>Services</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>serviceSubType</b> is already loaded, the result will contain the <b>ServiceSubTypes</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<ServiceSubTypes> getServiceSubTypeIfPresent() {
        return Optional.ofNullable(toServiceSubType);
    }

    /**
     * Overwrites the associated <b>ServiceSubTypes</b> entity for the loaded navigation property <b>serviceSubType</b>.
     * 
     * @param value
     *     New <b>ServiceSubTypes</b> entity.
     */
    public void setServiceSubType(final ServiceSubTypes value) {
        toServiceSubType = value;
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
        odataResourceUrl.append("code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(code));
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
     * If the navigation property <b>carrier</b> of a queried <b>Services</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
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
     * If the navigation property for an entity <b>Services</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
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

    public final static class ServicesBuilder {

        private ModeOfTransports toModeOfTransport;
        private ServiceTypes toServiceType;
        private ServiceSubTypes toServiceSubType;
        private Carriers toCarrier;

        private Services.ServicesBuilder toModeOfTransport(ModeOfTransports value) {
            toModeOfTransport = value;
            return this;
        }

        /**
         * Navigation property <b>modeOfTransport</b> for <b>Services</b> to single <b>ModeOfTransports</b>.
         * 
         */
        @Nonnull
        public Services.ServicesBuilder modeOfTransport(final ModeOfTransports value) {
            return toModeOfTransport(value);
        }

        private Services.ServicesBuilder toServiceType(ServiceTypes value) {
            toServiceType = value;
            return this;
        }

        /**
         * Navigation property <b>serviceType</b> for <b>Services</b> to single <b>ServiceTypes</b>.
         * 
         */
        @Nonnull
        public Services.ServicesBuilder serviceType(final ServiceTypes value) {
            return toServiceType(value);
        }

        private Services.ServicesBuilder toServiceSubType(ServiceSubTypes value) {
            toServiceSubType = value;
            return this;
        }

        /**
         * Navigation property <b>serviceSubType</b> for <b>Services</b> to single <b>ServiceSubTypes</b>.
         * 
         */
        @Nonnull
        public Services.ServicesBuilder serviceSubType(final ServiceSubTypes value) {
            return toServiceSubType(value);
        }

        private Services.ServicesBuilder toCarrier(Carriers value) {
            toCarrier = value;
            return this;
        }

        /**
         * Navigation property <b>carrier</b> for <b>Services</b> to single <b>Carriers</b>.
         * 
         */
        @Nonnull
        public Services.ServicesBuilder carrier(final Carriers value) {
            return toCarrier(value);
        }

    }

}
