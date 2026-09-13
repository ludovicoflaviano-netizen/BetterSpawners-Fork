# BetterSpawners-Fork

Modern Paper 1.21.11 spawner system with a clean GUI, virtual production, persistent storage, paid upgrades and Vault-compatible economy handling.

This is an independent fork-style rewrite inspired by the feature direction of BetterSpawners; it does not copy or redistribute the original author's source.

## Features
- Paper 1.21.11 / Java 21
- Vault economy service integration, compatible with Vault 2.0-style providers
- EconomyShopGUI-friendly economy flow through Vault
- Expensive Speed, Yield and Storage upgrade branches
- Virtual drops + XP storage to reduce live mob load
- Persistent spawner records
- Spawner break/place preservation
- Configurable mob drops and upgrade costs
- 54-slot GUI

Default upgrade cost is $50,000 and multiplies by 3.0 each level.

## Commands
`/bs` — help
`/bs give <mob> [amount]` — admin spawner items
`/bs clear` — clear stored records
`/bs info` — active record count

## Build
Requires Java 21 and Maven: `mvn clean package`

## Dependencies
Paper 1.21.11 and a Vault-compatible economy service. EconomyShopGUI can remain the shop layer while this plugin uses the shared Vault economy service.
