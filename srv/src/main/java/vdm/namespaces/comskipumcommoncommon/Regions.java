/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon;

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
import vdm.namespaces.comskipumcommoncommon.field.RegionsField;
import vdm.namespaces.comskipumcommoncommon.link.RegionsOneToOneLink;
import vdm.namespaces.comskipumcommoncommon.selectable.RegionsSelectable;


/**
 * <p>Original entity name from the Odata EDM: <b>Regions</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class Regions
    extends VdmEntity<Regions>
{

    /**
     * Selector for all available fields of Regions.
     * 
     */
    public final static RegionsSelectable ALL_FIELDS = new RegionsSelectable() {


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
    public final static RegionsField<String> NAME = new RegionsField<String>("name");
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
    public final static RegionsField<String> CODE = new RegionsField<String>("code");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>country_code</b></p>
     * 
     * @param country_code
     *     
     */
    @Key
    @SerializedName("country_code")
    @JsonProperty("country_code")
    @Nullable
    @ODataField(odataName = "country_code")
    private String country_code;
    /**
     * Use with available fluent helpers to apply the <b>country_code</b> field to query operations.
     * 
     */
    public final static RegionsField<String> COUNTRY_CODE = new RegionsField<String>("country_code");
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
     * Navigation property <b>country</b> for <b>Regions</b> to single <b>Countries</b>.
     * 
     */
    @SerializedName("country")
    @JsonProperty("country")
    @ODataField(odataName = "country")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Countries toCountry;
    /**
     * Use with available fluent helpers to apply the <b>country</b> navigation property to query operations.
     * 
     */
    public final static RegionsOneToOneLink<Countries> TO_COUNTRY = new RegionsOneToOneLink<Countries>("country");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<Regions> getType() {
        return Regions.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>country_code</b></p>
     * 
     * @param country_code
     *     
     */
    public void setCountry_code(
        @Nullable
        final String country_code) {
        rememberChangedField("Country_code", this.country_code);
        this.country_code = country_code;
    }

    @Override
    protected String getEntityCollection() {
        return "Regions";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("code", getCode());
        result.put("country_code", getCountry_code());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("name", getName());
        values.put("code", getCode());
        values.put("country_code", getCountry_code());
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
            if (values.containsKey("country_code")) {
                final Object value = values.remove("country_code");
                if ((value == null)||(!value.equals(getCountry_code()))) {
                    setCountry_code(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("country")) {
                final Object value = (values).remove("country");
                if (value instanceof Map) {
                    if (toCountry == null) {
                        toCountry = new Countries();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toCountry.fromMap(inputMap);
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
    public static<T >RegionsField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new RegionsField<T>(fieldName);
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
    public static<T,DomainT >RegionsField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new RegionsField<T>(fieldName, typeConverter);
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
        if (toCountry!= null) {
            (values).put("country", toCountry);
        }
        return values;
    }

    /**
     * Fetches the <b>Countries</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>country</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>Countries</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public Countries fetchCountry()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type Countries.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(code));
        odataResourceUrl.append(",country_code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(country_code));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("country");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final Countries entity = result.as(Countries.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>Countries</b> entity (one to one). This corresponds to the OData navigation property <b>country</b>.
     * <p>
     * If the navigation property <b>country</b> of a queried <b>Regions</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>Countries</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public Countries getCountryOrFetch()
        throws ODataException
    {
        if (toCountry == null) {
            toCountry = fetchCountry();
        }
        return toCountry;
    }

    /**
     * Retrieval of associated <b>Countries</b> entity (one to one). This corresponds to the OData navigation property <b>country</b>.
     * <p>
     * If the navigation property for an entity <b>Regions</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>country</b> is already loaded, the result will contain the <b>Countries</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<Countries> getCountryIfPresent() {
        return Optional.ofNullable(toCountry);
    }

    /**
     * Overwrites the associated <b>Countries</b> entity for the loaded navigation property <b>country</b>.
     * 
     * @param value
     *     New <b>Countries</b> entity.
     */
    public void setCountry(final Countries value) {
        toCountry = value;
    }

    public final static class RegionsBuilder {

        private Countries toCountry;

        private Regions.RegionsBuilder toCountry(Countries value) {
            toCountry = value;
            return this;
        }

        /**
         * Navigation property <b>country</b> for <b>Regions</b> to single <b>Countries</b>.
         * 
         */
        @Nonnull
        public Regions.RegionsBuilder country(final Countries value) {
            return toCountry(value);
        }

    }

}
