/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.services;

import javax.annotation.Nonnull;
import vdm.namespaces.comskipumcommoncarrier.CarrierActions;
import vdm.namespaces.comskipumcommoncarrier.CarrierActionsByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.CarrierActionsCreateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.CarrierActionsDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.CarrierActionsFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.CarrierActionsUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.CarrierFeeds;
import vdm.namespaces.comskipumcommoncarrier.CarrierFeedsByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.CarrierFeedsCreateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.CarrierFeedsDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.CarrierFeedsFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.CarrierFeedsUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.Carriers;
import vdm.namespaces.comskipumcommoncarrier.CarriersByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.CarriersCreateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.CarriersDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.CarriersFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.CarriersUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentActions;
import vdm.namespaces.comskipumcommoncarrier.ContentActionsByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentActionsCreateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentActionsDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentActionsFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentActionsUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentFeeds;
import vdm.namespaces.comskipumcommoncarrier.ContentFeedsByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentFeedsCreateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentFeedsDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentFeedsFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentFeedsUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentSources;
import vdm.namespaces.comskipumcommoncarrier.ContentSourcesByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentSourcesCreateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentSourcesDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentSourcesFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ContentSourcesUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ModeOfTransports;
import vdm.namespaces.comskipumcommoncarrier.ModeOfTransportsByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ModeOfTransportsCreateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ModeOfTransportsDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ModeOfTransportsFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ModeOfTransportsUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes;
import vdm.namespaces.comskipumcommoncarrier.ServiceSubTypesByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServiceSubTypesCreateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServiceSubTypesDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServiceSubTypesFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServiceSubTypesUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServiceTypes;
import vdm.namespaces.comskipumcommoncarrier.ServiceTypesByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServiceTypesCreateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServiceTypesDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServiceTypesFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServiceTypesUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.Services;
import vdm.namespaces.comskipumcommoncarrier.ServicesByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServicesCreateFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServicesDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServicesFluentHelper;
import vdm.namespaces.comskipumcommoncarrier.ServicesUpdateFluentHelper;


/**
 * <h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>comskipumcommonCarrierService</td></tr></table>
 * 
 */
public interface ComskipumcommonCarrierService {

    /**
     * If no other path was provided via the {@link #withServicePath(String)} method, this is the default service path used to access the endpoint.
     * 
     */
    String DEFAULT_SERVICE_PATH = "comskipumcommonCarrierService";

    /**
     * Overrides the default service path and returns a new service instance with the specified service path. Also adjusts the respective entity URLs.
     * 
     * @param servicePath
     *     Service path that will override the default.
     * @return
     *     A new service instance with the specified service path.
     */
    @Nonnull
    ComskipumcommonCarrierService withServicePath(
        @Nonnull
        final String servicePath);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarrierActionsFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarrierActionsFluentHelper getAllCarrierActions();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entity using key fields.
     * 
     * @param actionCode_code
     *     
     * @param carrier_code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarrierActionsByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarrierActionsByKeyFluentHelper getCarrierActionsByKey(final String actionCode_code, final String carrier_code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entity and save it to the S/4HANA system.
     * 
     * @param carrierActions
     *     {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarrierActionsCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarrierActionsCreateFluentHelper createCarrierActions(
        @Nonnull
        final CarrierActions carrierActions);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entity and save it to the S/4HANA system.
     * 
     * @param carrierActions
     *     {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarrierActionsUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarrierActionsUpdateFluentHelper updateCarrierActions(
        @Nonnull
        final CarrierActions carrierActions);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entity in the S/4HANA system.
     * 
     * @param carrierActions
     *     {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarrierActionsDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarrierActionsDeleteFluentHelper deleteCarrierActions(
        @Nonnull
        final CarrierActions carrierActions);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeedsFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarrierFeedsFluentHelper getAllCarrierFeeds();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity using key fields.
     * 
     * @param feed_code
     *     
     * @param carrier_code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeedsByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarrierFeedsByKeyFluentHelper getCarrierFeedsByKey(final String feed_code, final String carrier_code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity and save it to the S/4HANA system.
     * 
     * @param carrierFeeds
     *     {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeedsCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarrierFeedsCreateFluentHelper createCarrierFeeds(
        @Nonnull
        final CarrierFeeds carrierFeeds);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity and save it to the S/4HANA system.
     * 
     * @param carrierFeeds
     *     {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeedsUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarrierFeedsUpdateFluentHelper updateCarrierFeeds(
        @Nonnull
        final CarrierFeeds carrierFeeds);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity in the S/4HANA system.
     * 
     * @param carrierFeeds
     *     {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeeds CarrierFeeds} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarrierFeedsDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarrierFeedsDeleteFluentHelper deleteCarrierFeeds(
        @Nonnull
        final CarrierFeeds carrierFeeds);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarriersFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarriersFluentHelper getAllCarriers();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity using key fields.
     * 
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarriersByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarriersByKeyFluentHelper getCarriersByKey(final String code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity and save it to the S/4HANA system.
     * 
     * @param carriers
     *     {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarriersCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarriersCreateFluentHelper createCarriers(
        @Nonnull
        final Carriers carriers);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity and save it to the S/4HANA system.
     * 
     * @param carriers
     *     {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarriersUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarriersUpdateFluentHelper updateCarriers(
        @Nonnull
        final Carriers carriers);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity in the S/4HANA system.
     * 
     * @param carriers
     *     {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.CarriersDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CarriersDeleteFluentHelper deleteCarriers(
        @Nonnull
        final Carriers carriers);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentActionsFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentActionsFluentHelper getAllContentActions();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions} entity using key fields.
     * 
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentActionsByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentActionsByKeyFluentHelper getContentActionsByKey(final String code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions} entity and save it to the S/4HANA system.
     * 
     * @param contentActions
     *     {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentActionsCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentActionsCreateFluentHelper createContentActions(
        @Nonnull
        final ContentActions contentActions);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions} entity and save it to the S/4HANA system.
     * 
     * @param contentActions
     *     {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentActionsUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentActionsUpdateFluentHelper updateContentActions(
        @Nonnull
        final ContentActions contentActions);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions} entity in the S/4HANA system.
     * 
     * @param contentActions
     *     {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncarrier.ContentActions ContentActions} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentActionsDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentActionsDeleteFluentHelper deleteContentActions(
        @Nonnull
        final ContentActions contentActions);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentFeedsFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentFeedsFluentHelper getAllContentFeeds();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds} entity using key fields.
     * 
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentFeedsByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentFeedsByKeyFluentHelper getContentFeedsByKey(final String code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds} entity and save it to the S/4HANA system.
     * 
     * @param contentFeeds
     *     {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentFeedsCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentFeedsCreateFluentHelper createContentFeeds(
        @Nonnull
        final ContentFeeds contentFeeds);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds} entity and save it to the S/4HANA system.
     * 
     * @param contentFeeds
     *     {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentFeedsUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentFeedsUpdateFluentHelper updateContentFeeds(
        @Nonnull
        final ContentFeeds contentFeeds);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds} entity in the S/4HANA system.
     * 
     * @param contentFeeds
     *     {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncarrier.ContentFeeds ContentFeeds} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentFeedsDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentFeedsDeleteFluentHelper deleteContentFeeds(
        @Nonnull
        final ContentFeeds contentFeeds);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentSourcesFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentSourcesFluentHelper getAllContentSources();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources} entity using key fields.
     * 
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentSourcesByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentSourcesByKeyFluentHelper getContentSourcesByKey(final String code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources} entity and save it to the S/4HANA system.
     * 
     * @param contentSources
     *     {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentSourcesCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentSourcesCreateFluentHelper createContentSources(
        @Nonnull
        final ContentSources contentSources);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources} entity and save it to the S/4HANA system.
     * 
     * @param contentSources
     *     {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentSourcesUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentSourcesUpdateFluentHelper updateContentSources(
        @Nonnull
        final ContentSources contentSources);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources} entity in the S/4HANA system.
     * 
     * @param contentSources
     *     {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncarrier.ContentSources ContentSources} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ContentSourcesDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ContentSourcesDeleteFluentHelper deleteContentSources(
        @Nonnull
        final ContentSources contentSources);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransportsFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ModeOfTransportsFluentHelper getAllModeOfTransports();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports} entity using key fields.
     * 
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransportsByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ModeOfTransportsByKeyFluentHelper getModeOfTransportsByKey(final String code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports} entity and save it to the S/4HANA system.
     * 
     * @param modeOfTransports
     *     {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransportsCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ModeOfTransportsCreateFluentHelper createModeOfTransports(
        @Nonnull
        final ModeOfTransports modeOfTransports);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports} entity and save it to the S/4HANA system.
     * 
     * @param modeOfTransports
     *     {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransportsUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ModeOfTransportsUpdateFluentHelper updateModeOfTransports(
        @Nonnull
        final ModeOfTransports modeOfTransports);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports} entity in the S/4HANA system.
     * 
     * @param modeOfTransports
     *     {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransports ModeOfTransports} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ModeOfTransportsDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ModeOfTransportsDeleteFluentHelper deleteModeOfTransports(
        @Nonnull
        final ModeOfTransports modeOfTransports);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypesFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServiceSubTypesFluentHelper getAllServiceSubTypes();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes} entity using key fields.
     * 
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypesByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServiceSubTypesByKeyFluentHelper getServiceSubTypesByKey(final String code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes} entity and save it to the S/4HANA system.
     * 
     * @param serviceSubTypes
     *     {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypesCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServiceSubTypesCreateFluentHelper createServiceSubTypes(
        @Nonnull
        final ServiceSubTypes serviceSubTypes);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes} entity and save it to the S/4HANA system.
     * 
     * @param serviceSubTypes
     *     {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypesUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServiceSubTypesUpdateFluentHelper updateServiceSubTypes(
        @Nonnull
        final ServiceSubTypes serviceSubTypes);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes} entity in the S/4HANA system.
     * 
     * @param serviceSubTypes
     *     {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypesDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServiceSubTypesDeleteFluentHelper deleteServiceSubTypes(
        @Nonnull
        final ServiceSubTypes serviceSubTypes);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypesFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServiceTypesFluentHelper getAllServiceTypes();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entity using key fields.
     * 
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypesByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServiceTypesByKeyFluentHelper getServiceTypesByKey(final String code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entity and save it to the S/4HANA system.
     * 
     * @param serviceTypes
     *     {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypesCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServiceTypesCreateFluentHelper createServiceTypes(
        @Nonnull
        final ServiceTypes serviceTypes);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entity and save it to the S/4HANA system.
     * 
     * @param serviceTypes
     *     {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypesUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServiceTypesUpdateFluentHelper updateServiceTypes(
        @Nonnull
        final ServiceTypes serviceTypes);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entity in the S/4HANA system.
     * 
     * @param serviceTypes
     *     {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypesDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServiceTypesDeleteFluentHelper deleteServiceTypes(
        @Nonnull
        final ServiceTypes serviceTypes);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.Services Services} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncarrier.Services Services} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServicesFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServicesFluentHelper getAllServices();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncarrier.Services Services} entity using key fields.
     * 
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncarrier.Services Services} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServicesByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServicesByKeyFluentHelper getServicesByKey(final String code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncarrier.Services Services} entity and save it to the S/4HANA system.
     * 
     * @param services
     *     {@link vdm.namespaces.comskipumcommoncarrier.Services Services} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncarrier.Services Services} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServicesCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServicesCreateFluentHelper createServices(
        @Nonnull
        final Services services);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncarrier.Services Services} entity and save it to the S/4HANA system.
     * 
     * @param services
     *     {@link vdm.namespaces.comskipumcommoncarrier.Services Services} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncarrier.Services Services} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServicesUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServicesUpdateFluentHelper updateServices(
        @Nonnull
        final Services services);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncarrier.Services Services} entity in the S/4HANA system.
     * 
     * @param services
     *     {@link vdm.namespaces.comskipumcommoncarrier.Services Services} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncarrier.Services Services} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncarrier.ServicesDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ServicesDeleteFluentHelper deleteServices(
        @Nonnull
        final Services services);

}
