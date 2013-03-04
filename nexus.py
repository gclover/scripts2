#!/usr/bin/python

import glob
import os
import string
import sys

repo_url = 'http://10.200.41.5:4041/nexus/content/repositories/releases'
repository = 'releases'

def install(path):

	jars = glob.glob('%s/*.jar' % path)
	for jar in jars:
		realpath = os.path.realpath(jar)
		tokens = jar.split('/')[-1][0:-4].split('-')
		group = 'local'
		artifact = string.join(tokens[0:-1], '-')
		version = tokens[-1]
		cmd = 'mvn deploy:deploy-file -DgroupId=%s -DartifactId=%s -Dversion=%s ' \
				'-Dpackaging=jar -Dfile=%s -Durl=%s -DrepositoryId=%s '  \
				% (group, artifact, version, realpath, repo_url, repository)
		print cmd
		os.system(cmd)

if __name__ == "__main__":
	command = sys.argv[1]
	if command == 'install':
		install('lib')


