namespace com.skipum.shippingExecution;

using com.skipum.common.measures as measures from '@contax/skipum-common';
using com.skipum.common.currency as currency from '@contax/skipum-common';
using com.skipum.common.geographic as geographic from '@contax/skipum-common';
using com.skipum.common.carrier as carrier from '@contax/skipum-common';
using com.skipum.common.contentSource as contentSource from '@contax/skipum-common';
using com.skipum.common.packaging as packaging from '@contax/skipum-common';
using com.skipum.shippingExecution as shippingExecution from '@contax/skipum-shippingExecution';

service ShippingExecutionService {
	@readonly entity ShipmentProcessingStatuses
	@(
		title : 'Processing Status'
	)
	as projection on shippingExecution.ShipmentProcessingStatus;

	@readonly entity ShipmentPackingStatuses
	@(
		title : 'Packing Status'
	)
	as projection on shippingExecution.ShipmentPackingStatus;

	@readonly entity ShipmentTransmitStatuses
	@(
		title : 'Transmit Status'
	)
	as projection on shippingExecution.ShipmentTransmitStatus;
	
	@readonly entity ShipmentPrintingStatuses
	@(
		title : 'Printing Status'
	)
	as projection on shippingExecution.ShipmentPrintingStatus;



//Shipment Leg Value Helps
	@readonly entity ShipmentLegProcessingStatuses
	@(
		title : 'Processing Status'
	)
	as projection on shippingExecution.LegProcessingStatus;

	@readonly entity ShipmentLegPackingStatuses
	@(
		title : 'Packing Status'
	)
	as projection on shippingExecution.LegPackingStatus;

	@readonly entity ShipmentLegTransmitStatuses
	@(
		title : 'Transmit Status'
	)
	as projection on shippingExecution.LegTransmitStatus;
	
	@readonly entity ShipmentLegPrintingStatuses
	@(
		title : 'Printing Status'
	)
	as projection on shippingExecution.LegPrintingStatus;
	
	@readonly entity PaymentTerms
	@(
		title : 'Payment Terms'
	)
	as projection on shippingExecution.PaymentTerm;
	
	@readonly entity CarrierPayers
	@(
		title : 'Carrier Payer'
	)
	as projection on shippingExecution.Payer;
	
	@readonly entity IncoTerms
	@(
		title : 'Incoterms'
	)
	as projection on shippingExecution.Incoterm;
	

//Handling Unit Value Helps
	@readonly entity PackagingTypes
	@(
		title : 'Packaging Type'
	)
	as projection on packaging.PackagingType;
	
	@readonly entity ContainerTypes
	@(
		title : 'Container Type'
	)
	as projection on packaging.ContainerType;

}