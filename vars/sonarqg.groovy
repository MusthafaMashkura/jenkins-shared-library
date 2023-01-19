def Qualitygate() {
timeout(time: 1, unit: 'HOURS')
waitForQualityGate abortPipeline: true
}
