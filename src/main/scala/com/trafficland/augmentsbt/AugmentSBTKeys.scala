package com.trafficland.augmentsbt

/**
 * Collection of keys across all plugins.
 *
 * This file was generated by bin/generate-keys and should not be altered by hand.
 */
 object AugmentSBTKeys {

  /* ReleaseManagementPlugin (from src/main/scala/com/trafficland/augmentsbt/releasemanagement/ReleaseManagementPlugin.scala) */
  import com.trafficland.augmentsbt.releasemanagement.ReleaseManagementPlugin
  val releaseReady = ReleaseManagementPlugin.autoImport.releaseReady
  val isApp = ReleaseManagementPlugin.autoImport.isApp
  val remoteGitRepoPatterns = ReleaseManagementPlugin.autoImport.remoteGitRepoPatterns

  /* StartupScriptPlugin (from src/main/scala/com/trafficland/augmentsbt/distribute/StartupScriptPlugin.scala) */
  import com.trafficland.augmentsbt.distribute.StartupScriptPlugin
  val startScriptMainArguments = StartupScriptPlugin.autoImport.startScriptMainArguments
  val startScriptJavaOptions = StartupScriptPlugin.autoImport.startScriptJavaOptions
  val startScriptConfigFileName = StartupScriptPlugin.autoImport.startScriptConfigFileName
  val loggingConfigFileName = StartupScriptPlugin.autoImport.loggingConfigFileName

  /* Keys (from src/main/scala/com/trafficland/augmentsbt/rpm/Keys.scala) */
  val vendorDirectory = com.trafficland.augmentsbt.rpm.Keys.vendorDirectory
  val destinationDirectory = com.trafficland.augmentsbt.rpm.Keys.destinationDirectory
  val installationDirectory = com.trafficland.augmentsbt.rpm.Keys.installationDirectory
  val linuxUserAndGroup = com.trafficland.augmentsbt.rpm.Keys.linuxUserAndGroup
  val installedInitScriptName = com.trafficland.augmentsbt.rpm.Keys.installedInitScriptName
  val manageDaemonAccounts = com.trafficland.augmentsbt.rpm.Keys.manageDaemonAccounts
  val scriptTemplates = com.trafficland.augmentsbt.rpm.Keys.scriptTemplates

  /* CentOSRPMPlugin (from src/main/scala/com/trafficland/augmentsbt/rpm/CentOSRPMPlugin.scala) */
  import com.trafficland.augmentsbt.rpm.CentOSRPMPlugin
  val scriptsDirectory = CentOSRPMPlugin.autoImport.scriptsDirectory

  /* LogbackConfigurationPlugin (from src/main/scala/com/trafficland/augmentsbt/generators/LogbackConfigurationPlugin.scala) */
  import com.trafficland.augmentsbt.generators.LogbackConfigurationPlugin
  val generateLogbackConf = LogbackConfigurationPlugin.autoImport.generateLogbackConf
  val generateLogbackTestConf = LogbackConfigurationPlugin.autoImport.generateLogbackTestConf
  val logbackTargetFile = LogbackConfigurationPlugin.autoImport.logbackTargetFile
  val logbackTestTargetFile = LogbackConfigurationPlugin.autoImport.logbackTestTargetFile

  /* AppInfoPlugin (from src/main/scala/com/trafficland/augmentsbt/generators/AppInfoPlugin.scala) */
  import com.trafficland.augmentsbt.generators.AppInfoPlugin
  val appInfoPropertiesFileName = AppInfoPlugin.autoImport.appInfoPropertiesFileName
  val appInfoPropertiesWrite = AppInfoPlugin.autoImport.appInfoPropertiesWrite
  val appInfoPropertiesFile = AppInfoPlugin.autoImport.appInfoPropertiesFile
  val generateAppInfoClass = AppInfoPlugin.autoImport.generateAppInfoClass

  /* BuildInfoPlugin (from src/main/scala/com/trafficland/augmentsbt/generators/BuildInfoPlugin.scala) */
  import com.trafficland.augmentsbt.generators.BuildInfoPlugin
  val buildInfoPropertiesFileName = BuildInfoPlugin.autoImport.buildInfoPropertiesFileName
  val buildInfoPropertiesWrite = BuildInfoPlugin.autoImport.buildInfoPropertiesWrite
  val buildInfoPropertiesFile = BuildInfoPlugin.autoImport.buildInfoPropertiesFile
  val generateBuildInfoClass = BuildInfoPlugin.autoImport.generateBuildInfoClass

  /* ConfigurationDirectory (from src/main/scala/com/trafficland/augmentsbt/generators/ConfigurationDirectory.scala) */
  import com.trafficland.augmentsbt.generators.ConfigurationDirectory
  val confDirectory = ConfigurationDirectory.autoImport.confDirectory

  /* VersionManagementPlugin (from src/main/scala/com/trafficland/augmentsbt/versionmanagement/VersionManagementPlugin.scala) */
  import com.trafficland.augmentsbt.versionmanagement.VersionManagementPlugin
  val versionSettingRegexes = VersionManagementPlugin.autoImport.versionSettingRegexes

  /* GitPlugin (from src/main/scala/com/trafficland/augmentsbt/git/GitPlugin.scala) */
  import com.trafficland.augmentsbt.git.GitPlugin
  val gitIsRepository = GitPlugin.autoImport.gitIsRepository
  val gitStatus = GitPlugin.autoImport.gitStatus
  val gitIsCleanWorkingTree = GitPlugin.autoImport.gitIsCleanWorkingTree
  val gitTrackingBranch = GitPlugin.autoImport.gitTrackingBranch
  val gitDescribeBranches = GitPlugin.autoImport.gitDescribeBranches
  val gitBranchName = GitPlugin.autoImport.gitBranchName
  val gitShowAllTags = GitPlugin.autoImport.gitShowAllTags
  val gitTag = GitPlugin.autoImport.gitTag
  val gitTagName = GitPlugin.autoImport.gitTagName
  val gitVersionBumpCommitMessage = GitPlugin.autoImport.gitVersionBumpCommitMessage
  val gitVersionBumpCommit = GitPlugin.autoImport.gitVersionBumpCommit
  val gitReleaseCommitMessage = GitPlugin.autoImport.gitReleaseCommitMessage
  val gitReleaseCommit = GitPlugin.autoImport.gitReleaseCommit
  val gitCommit = GitPlugin.autoImport.gitCommit
  val gitPushOrigin = GitPlugin.autoImport.gitPushOrigin
  val gitCheckoutMaster = GitPlugin.autoImport.gitCheckoutMaster
  val gitCheckoutDevelop = GitPlugin.autoImport.gitCheckoutDevelop
  val gitMergeDevelop = GitPlugin.autoImport.gitMergeDevelop
  val gitHeadCommitSha = GitPlugin.autoImport.gitHeadCommitSha
  val gitLastCommitsCount = GitPlugin.autoImport.gitLastCommitsCount
  val gitLastCommits = GitPlugin.autoImport.gitLastCommits
  val gitSshKeyAgent = GitPlugin.autoImport.gitSshKeyAgent

}
