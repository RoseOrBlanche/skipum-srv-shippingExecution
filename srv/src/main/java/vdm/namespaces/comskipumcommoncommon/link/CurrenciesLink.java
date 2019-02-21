/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject;
import vdm.namespaces.comskipumcommoncommon.Currencies;
import vdm.namespaces.comskipumcommoncommon.selectable.CurrenciesSelectable;


/**
 * Template class to represent entity navigation links of {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class CurrenciesLink<ObjectT extends VdmObject<?> >
    extends EntityLink<CurrenciesLink<ObjectT> , Currencies, ObjectT>
    implements CurrenciesSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public CurrenciesLink(final String fieldName) {
        super(fieldName);
    }

    private CurrenciesLink(final EntityLink<CurrenciesLink<ObjectT> , Currencies, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected CurrenciesLink<ObjectT> translateLinkType(final EntityLink<CurrenciesLink<ObjectT> , Currencies, ObjectT> link) {
        return new CurrenciesLink<ObjectT>(link);
    }

}
