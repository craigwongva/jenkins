// Copyright 2016, RadiantBlue Technologies, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

class Repos {
  static repos = [
/*    
    [
      reponame: 'bf-api',
      team: 'beachfront',
      manual: ['sonar', 'archive', 'cf_push', 'cf_bg_deploy', 'cf_promote_to_stage', 'cf_promote_to_prod'],
      pipeline: ['sonar', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'beachfront_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage']
    ],[
      reponame: 'bf-ia-broker',
      team: 'beachfront',
      team: 'beachfront',
      manual: ['archive', 'cf_push', 'cf_bg_deploy', 'cf_promote_to_stage', 'cf_promote_to_prod'],
      pipeline: ['archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'beachfront_integration_tests']
    ],[
      reponame: 'bf-swagger',
      team: 'beachfront',
      manual: ['gitlab_push'],
      pipeline: ['sonar', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'beachfront_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage']
    ],[
      reponame: 'bf-tideprediction',
      team: 'beachfront',
      manual: ['sonar', 'archive', 'cf_push', 'cf_bg_deploy', 'cf_promote_to_stage', 'cf_promote_to_prod'],
      pipeline: ['sonar', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'beachfront_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage']
    ],*/[
      reponame: 'craigbfui', //'bf-ui',
      team: 'beachfront',
      manual: [/*'sonar', 'archive', 'cf_push', 'cf_bg_deploy', 'cf_promote_to_stage', 'cf_promote_to_prod'*/],
      pipeline: [
       //'sonar',
       'archive',
       'cf_push_int',
       //'zap',
       'cf_bg_deploy_int',
       //'beachfront_ua_tests_int',
       'cf_push_stage',
       'cf_bg_deploy_stage',
       //'beachfront_ua_tests_stage'
      ]
    ],/*[
      reponame: 'bftest-ui',
      team: 'beachfront',
      pipeline: ['selenium'],
      manual: ['selenium']
    ],[
      reponame: 'geojson-geos-go',
      lib: true,
      team: 'beachfront',
      manual: ['gitlab_push'],
      pipeline: ['archive']
    ],[
      reponame: 'geojson-go',
      lib: true,
      team: 'beachfront',
      manual: ['gitlab_push'],
      pipeline: ['archive']
    ],[
      reponame: 'pzsvc-exec',
      lib: true,
      team: 'beachfront',
      manual: ['gitlab_push'],
      pipeline: ['archive', 'zap']
    ],[
      reponame: 'pzsvc-image-catalog',
      team: 'beachfront',
      manual: ['archive', 'cf_push', 'cf_bg_deploy', 'cf_promote_to_stage', 'cf_promote_to_prod'],
      pipeline: ['archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'beachfront_integration_tests']
    ],[
      reponame: 'pzsvc-lib',
      lib: true,
      team: 'beachfront',
      manual: ['gitlab_push'],
      pipeline: ['archive']
    ],[
      reponame: 'pzsvc-ndwi-py',
      team: 'beachfront',
      manual: ['archive', 'cf_push', 'cf_bg_deploy'],
      pipeline: ['archive', 'cf_push_int', 'cf_bg_deploy_int', 'beachfront_integration_tests']
    ],[
      reponame: 'pzsvc-ossim',
      team: 'beachfront',
      manual: ['archive', 'cf_push', 'cf_bg_deploy'],
      pipeline: ['archive', 'cf_push_int', 'cf_bg_deploy_int', 'beachfront_integration_tests']
    ],[
      reponame: 'osh-comm',
      gh_org: 'OpenSensorHub',
      team: 'osh',
      pipeline: ['archive']
    ],[
      reponame: 'osh-core',
      gh_org: 'OpenSensorHub',
      team: 'osh',
      pipeline: ['archive']
    ],[
      reponame: 'osh-processing',
      gh_org: 'OpenSensorHub',
      team: 'osh',
      pipeline: ['archive']
    ],[
      reponame: 'osh-security',
      gh_org: 'OpenSensorHub',
      team: 'osh',
      pipeline: ['archive']
    ],[
      reponame: 'osh-sensors',
      gh_org: 'OpenSensorHub',
      team: 'osh',
      pipeline: ['archive']
    ],[
      reponame: 'osh-services',
      gh_org: 'OpenSensorHub',
      team: 'osh',
      pipeline: ['archive']
    ],[
      //intentionally first among Piazza repos: see task#15556
      reponame: 'pz-logger',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['test', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage', 'run_integration_tests_stage']
    ],[
      reponame: 'pz-access',
      team: 'sandbox',
      manual: ['gitlab_push'],
      pipeline: ['sonar', 'ionchannel_pom', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage', 'run_integration_tests_stage']
    ],[
      reponame: 'pz-docs',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage', 'run_integration_tests_stage']
    ],[
      reponame: 'pz-gateway',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['sonar', 'ionchannel_pom', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage', 'run_integration_tests_stage']
    ],[
      reponame: 'pz-gocommon',
      lib: true,
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['test', 'archive']
    ],[
      reponame: 'pz-idam',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['sonar', 'ionchannel_pom', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage', 'run_integration_tests_stage']
    ],[
      reponame: 'pz-ingest',
      team: 'piazza',
      manual: ['cf_promote_to_prod', 'gitlab_push'],
      pipeline: ['sonar', 'ionchannel_pom', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage', 'run_integration_tests_stage']
    ],[
      reponame: 'pz-jobcommon',
      lib: true,
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['sonar', 'ionchannel_pom', 'archive', 'fortify']
    ],[
      reponame: 'pz-javalogger',
      lib: true,
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['ionchannel_pom', 'archive', 'fortify']
    ],[
      reponame: 'pz-jobmanager',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['sonar', 'ionchannel_pom', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage', 'run_integration_tests_stage']
    ],[
      reponame: 'pz-sak',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['karma', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage', 'run_integration_tests_stage']
    ],[
      reponame: 'pz-search-metadata-ingest',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['sonar', 'ionchannel_pom', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage', 'run_integration_tests_stage']
    ],[
      reponame: 'pz-search-query',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['sonar', 'ionchannel_pom', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage','run_integration_tests_stage']
    ],[
      reponame: 'pz-servicecontroller',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['sonar', 'ionchannel_pom', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage','run_integration_tests_stage']
    ],[
      reponame: 'pz-swagger',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['sonar', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage','run_integration_tests_stage']
    ],[
      reponame: 'pz-uuidgen',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['test', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage','run_integration_tests_stage']
    ],[
      reponame: 'pz-workflow',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['test', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage','run_integration_tests_stage']
    ],[
      reponame: 'pzsvc-hello',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['test', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage','run_integration_tests_stage']
    ],[
      reponame: 'pzsvc-preview-generator',
      team: 'piazza',
      manual: ['gitlab_push'],
      pipeline: ['ionchannel_pom', 'archive', 'cf_push_int', 'zap', 'cf_bg_deploy_int', 'run_integration_tests', 'cf_push_stage', 'cf_bg_deploy_stage','run_integration_tests_stage']
    ],[
      reponame: 'pzsvc-gdaldem',
      team: 'pointcloud',
      manual: ['cf_push', 'cf_bg_deploy', 'cf_promote_to_stage', 'cf_promote_to_prod'],
      pipeline: ['test', 'archive', 'cf_push_int', 'cf_bg_deploy_int', "blackbox"]
    ],[
      reponame: 'pzsvc-lasinfo',
      team: 'pointcloud',
      manual: ['cf_push', 'cf_bg_deploy', 'cf_promote_to_stage', 'cf_promote_to_prod'],
      pipeline: ['test', 'archive', 'cf_push_int', 'cf_bg_deploy_int', "blackbox"]
    ],[
      reponame: 'pzsvc-pdal',
      team: 'pointcloud',
      manual: ['cf_push', 'cf_bg_deploy', 'cf_promote_to_stage', 'cf_promote_to_prod'],
      pipeline: ['test', 'archive', 'cf_push_int', 'cf_bg_deploy_int', "blackbox"]
    ],[
      reponame: 'gs-jupyterhub',
      team: 'sandbox',
      pipeline: ['build-rpm', 'archive'],
      branch: '**'
    ],[
      reponame: 'pz-craigflask',
      team: 'sandbox',
      pipeline: ['archive', 'cf_push_int', 'cf_bg_deploy_int']
    ],[
      reponame: 'pz-servicemonitor',
      team: 'sandbox',
      pipeline: ['archive', 'cf_push_int', 'cf_bg_deploy_int']
    ],[
      reponame: 'tlv',
      team: 'tlv',
      manual: ['archive', 'cf_push', 'cf_bg_deploy', 'cf_promote_to_stage', 'cf_promote_to_prod'],
      pipeline: ['archive', 'cf_push_int', 'cf_bg_deploy_int']
    ]
*/
  ]
}
