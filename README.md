OpenChessTD
===========

Chess Tournament Director software

This program is intended to help USCF Tournament Directors run tournaments. To that end, this software will (in due time) eventually be able to perform the tasks needed, such as importing USCF rating supplements, pairing rounds of a tournament, and even submitting those tournaments online for rating. 

Currently, no build system is in place (other than building inside Eclipse), and there probable won't be for a while, as I'm more interested in getting some basic functionality done first. 

Basic structure:

OpenChessTD-module: contains the data model and common functions needed across all modules.
OpenChessTD-WebDriver: contains the Selenium WebDriver scripts needed to automate tournament submission. 
OpenChessTD-SwingView: will contain a Swing Frontend for the application
