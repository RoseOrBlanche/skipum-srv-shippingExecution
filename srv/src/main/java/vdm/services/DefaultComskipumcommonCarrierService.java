/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.services;

import javax.annotation.Nonnull;
import javax.inject.Named;
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
@Named("vdm.services.DefaultComskipumcommonCarrierService")
public class DefaultComskipumcommonCarrierService
    implements ComskipumcommonCarrierService
{

    @Nonnull
    private final String servicePath;

    /**
     * Creates a service using {@link ComskipumcommonCarrierService#DEFAULT_SERVICE_PATH} to send the requests.
     * 
     */
    public DefaultComskipumcommonCarrierService() {
        servicePath = ComskipumcommonCarrierService.DEFAULT_SERVICE_PATH;
    }

    /**
     * Creates a service using the provided service path to send the requests.
     * <p>
     * Used by the fluent {@link #withServicePath(String)} method.
     * 
     */
    private DefaultComskipumcommonCarrierService(
        @Nonnull
        final String servicePath) {
        this.servicePath = servicePath;
    }

    @Override
    @Nonnull
    public DefaultComskipumcommonCarrierService withServicePath(
        @Nonnull
        final String servicePath) {
        return new DefaultComskipumcommonCarrierService(servicePath);
    }

    @Override
    @Nonnull
    public CarrierActionsFluentHelper getAllCarrierActions() {
        return new CarrierActionsFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CarrierActionsByKeyFluentHelper getCarrierActionsByKey(final String actionCode_code, final String carrier_code) {
        return new CarrierActionsByKeyFluentHelper(servicePath, actionCode_code, carrier_code);
    }

    @Override
    @Nonnull
    public CarrierActionsCreateFluentHelper createCarrierActions(
        @Nonnull
        final CarrierActions carrierActions) {
        return new CarrierActionsCreateFluentHelper(servicePath, carrierActions);
    }

    @Override
    @Nonnull
    public CarrierActionsUpdateFluentHelper updateCarrierActions(
        @Nonnull
        final CarrierActions carrierActions) {
        return new CarrierActionsUpdateFluentHelper(servicePath, carrierActions);
    }

    @Override
    @Nonnull
    public CarrierActionsDeleteFluentHelper deleteCarrierActions(
        @Nonnull
        final CarrierActions carrierActions) {
        return new CarrierActionsDeleteFluentHelper(servicePath, carrierActions);
    }

    @Override
    @Nonnull
    public CarrierFeedsFluentHelper getAllCarrierFeeds() {
        return new CarrierFeedsFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CarrierFeedsByKeyFluentHelper getCarrierFeedsByKey(final String feed_code, final String carrier_code) {
        return new CarrierFeedsByKeyFluentHelper(servicePath, feed_code, carrier_code);
    }

    @Override
    @Nonnull
    public CarrierFeedsCreateFluentHelper createCarrierFeeds(
        @Nonnull
        final CarrierFeeds carrierFeeds) {
        return new CarrierFeedsCreateFluentHelper(servicePath, carrierFeeds);
    }

    @Override
    @Nonnull
    public CarrierFeedsUpdateFluentHelper updateCarrierFeeds(
        @Nonnull
        final CarrierFeeds carrierFeeds) {
        return new CarrierFeedsUpdateFluentHelper(servicePath, carrierFeeds);
    }

    @Override
    @Nonnull
    public CarrierFeedsDeleteFluentHelper deleteCarrierFeeds(
        @Nonnull
        final CarrierFeeds carrierFeeds) {
        return new CarrierFeedsDeleteFluentHelper(servicePath, carrierFeeds);
    }

    @Override
    @Nonnull
    public CarriersFluentHelper getAllCarriers() {
        return new CarriersFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CarriersByKeyFluentHelper getCarriersByKey(final String code) {
        return new CarriersByKeyFluentHelper(servicePath, code);
    }

    @Override
    @Nonnull
    public CarriersCreateFluentHelper createCarriers(
        @Nonnull
        final Carriers carriers) {
        return new CarriersCreateFluentHelper(servicePath, carriers);
    }

    @Override
    @Nonnull
    public CarriersUpdateFluentHelper updateCarriers(
        @Nonnull
        final Carriers carriers) {
        return new CarriersUpdateFluentHelper(servicePath, carriers);
    }

    @Override
    @Nonnull
    public CarriersDeleteFluentHelper deleteCarriers(
        @Nonnull
        final Carriers carriers) {
        return new CarriersDeleteFluentHelper(servicePath, carriers);
    }

    @Override
    @Nonnull
    public ContentActionsFluentHelper getAllContentActions() {
        return new ContentActionsFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public ContentActionsByKeyFluentHelper getContentActionsByKey(final String code) {
        return new ContentActionsByKeyFluentHelper(servicePath, code);
    }

    @Override
    @Nonnull
    public ContentActionsCreateFluentHelper createContentActions(
        @Nonnull
        final ContentActions contentActions) {
        return new ContentActionsCreateFluentHelper(servicePath, contentActions);
    }

    @Override
    @Nonnull
    public ContentActionsUpdateFluentHelper updateContentActions(
        @Nonnull
        final ContentActions contentActions) {
        return new ContentActionsUpdateFluentHelper(servicePath, contentActions);
    }

    @Override
    @Nonnull
    public ContentActionsDeleteFluentHelper deleteContentActions(
        @Nonnull
        final ContentActions contentActions) {
        return new ContentActionsDeleteFluentHelper(servicePath, contentActions);
    }

    @Override
    @Nonnull
    public ContentFeedsFluentHelper getAllContentFeeds() {
        return new ContentFeedsFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public ContentFeedsByKeyFluentHelper getContentFeedsByKey(final String code) {
        return new ContentFeedsByKeyFluentHelper(servicePath, code);
    }

    @Override
    @Nonnull
    public ContentFeedsCreateFluentHelper createContentFeeds(
        @Nonnull
        final ContentFeeds contentFeeds) {
        return new ContentFeedsCreateFluentHelper(servicePath, contentFeeds);
    }

    @Override
    @Nonnull
    public ContentFeedsUpdateFluentHelper updateContentFeeds(
        @Nonnull
        final ContentFeeds contentFeeds) {
        return new ContentFeedsUpdateFluentHelper(servicePath, contentFeeds);
    }

    @Override
    @Nonnull
    public ContentFeedsDeleteFluentHelper deleteContentFeeds(
        @Nonnull
        final ContentFeeds contentFeeds) {
        return new ContentFeedsDeleteFluentHelper(servicePath, contentFeeds);
    }

    @Override
    @Nonnull
    public ContentSourcesFluentHelper getAllContentSources() {
        return new ContentSourcesFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public ContentSourcesByKeyFluentHelper getContentSourcesByKey(final String code) {
        return new ContentSourcesByKeyFluentHelper(servicePath, code);
    }

    @Override
    @Nonnull
    public ContentSourcesCreateFluentHelper createContentSources(
        @Nonnull
        final ContentSources contentSources) {
        return new ContentSourcesCreateFluentHelper(servicePath, contentSources);
    }

    @Override
    @Nonnull
    public ContentSourcesUpdateFluentHelper updateContentSources(
        @Nonnull
        final ContentSources contentSources) {
        return new ContentSourcesUpdateFluentHelper(servicePath, contentSources);
    }

    @Override
    @Nonnull
    public ContentSourcesDeleteFluentHelper deleteContentSources(
        @Nonnull
        final ContentSources contentSources) {
        return new ContentSourcesDeleteFluentHelper(servicePath, contentSources);
    }

    @Override
    @Nonnull
    public ModeOfTransportsFluentHelper getAllModeOfTransports() {
        return new ModeOfTransportsFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public ModeOfTransportsByKeyFluentHelper getModeOfTransportsByKey(final String code) {
        return new ModeOfTransportsByKeyFluentHelper(servicePath, code);
    }

    @Override
    @Nonnull
    public ModeOfTransportsCreateFluentHelper createModeOfTransports(
        @Nonnull
        final ModeOfTransports modeOfTransports) {
        return new ModeOfTransportsCreateFluentHelper(servicePath, modeOfTransports);
    }

    @Override
    @Nonnull
    public ModeOfTransportsUpdateFluentHelper updateModeOfTransports(
        @Nonnull
        final ModeOfTransports modeOfTransports) {
        return new ModeOfTransportsUpdateFluentHelper(servicePath, modeOfTransports);
    }

    @Override
    @Nonnull
    public ModeOfTransportsDeleteFluentHelper deleteModeOfTransports(
        @Nonnull
        final ModeOfTransports modeOfTransports) {
        return new ModeOfTransportsDeleteFluentHelper(servicePath, modeOfTransports);
    }

    @Override
    @Nonnull
    public ServiceSubTypesFluentHelper getAllServiceSubTypes() {
        return new ServiceSubTypesFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public ServiceSubTypesByKeyFluentHelper getServiceSubTypesByKey(final String code) {
        return new ServiceSubTypesByKeyFluentHelper(servicePath, code);
    }

    @Override
    @Nonnull
    public ServiceSubTypesCreateFluentHelper createServiceSubTypes(
        @Nonnull
        final ServiceSubTypes serviceSubTypes) {
        return new ServiceSubTypesCreateFluentHelper(servicePath, serviceSubTypes);
    }

    @Override
    @Nonnull
    public ServiceSubTypesUpdateFluentHelper updateServiceSubTypes(
        @Nonnull
        final ServiceSubTypes serviceSubTypes) {
        return new ServiceSubTypesUpdateFluentHelper(servicePath, serviceSubTypes);
    }

    @Override
    @Nonnull
    public ServiceSubTypesDeleteFluentHelper deleteServiceSubTypes(
        @Nonnull
        final ServiceSubTypes serviceSubTypes) {
        return new ServiceSubTypesDeleteFluentHelper(servicePath, serviceSubTypes);
    }

    @Override
    @Nonnull
    public ServiceTypesFluentHelper getAllServiceTypes() {
        return new ServiceTypesFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public ServiceTypesByKeyFluentHelper getServiceTypesByKey(final String code) {
        return new ServiceTypesByKeyFluentHelper(servicePath, code);
    }

    @Override
    @Nonnull
    public ServiceTypesCreateFluentHelper createServiceTypes(
        @Nonnull
        final ServiceTypes serviceTypes) {
        return new ServiceTypesCreateFluentHelper(servicePath, serviceTypes);
    }

    @Override
    @Nonnull
    public ServiceTypesUpdateFluentHelper updateServiceTypes(
        @Nonnull
        final ServiceTypes serviceTypes) {
        return new ServiceTypesUpdateFluentHelper(servicePath, serviceTypes);
    }

    @Override
    @Nonnull
    public ServiceTypesDeleteFluentHelper deleteServiceTypes(
        @Nonnull
        final ServiceTypes serviceTypes) {
        return new ServiceTypesDeleteFluentHelper(servicePath, serviceTypes);
    }

    @Override
    @Nonnull
    public ServicesFluentHelper getAllServices() {
        return new ServicesFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public ServicesByKeyFluentHelper getServicesByKey(final String code) {
        return new ServicesByKeyFluentHelper(servicePath, code);
    }

    @Override
    @Nonnull
    public ServicesCreateFluentHelper createServices(
        @Nonnull
        final Services services) {
        return new ServicesCreateFluentHelper(servicePath, services);
    }

    @Override
    @Nonnull
    public ServicesUpdateFluentHelper updateServices(
        @Nonnull
        final Services services) {
        return new ServicesUpdateFluentHelper(servicePath, services);
    }

    @Override
    @Nonnull
    public ServicesDeleteFluentHelper deleteServices(
        @Nonnull
        final Services services) {
        return new ServicesDeleteFluentHelper(servicePath, services);
    }

}
