Sample Java Project with Chef
=============================

[German / Deutsch](LIESMICH.md)

This is a sample to show how Chef can be used to configure a Java environment.

The web application is located in `cookbooks/webapp/files/default` .

Look at `roles/tomcatserver.json` to figure out which recipes are run
and how they are customized. The cookbooks are taken from the
Opscode's Open Source repository.

## Vagrant

The Vagrantfile can be used to provision the Java application on a
virtual machine managed by VirtualBox. See http://vagrantup.com/
. To see the application running just use:
`vagrant up`

The application can be accessed at http://localhost:18080/demo/ .

## Chef Solo on Ubuntu 16.04

Another possibility is to provision the application using chef
solo. This works on Ubuntu 16.04:

* Install Chef using `sudo apt-get install chef`

* Install git using `sudo apt-get install git-core`

* Clone the Github repository `git clone
  https://github.com/ewolff/user-registration-V2.git`
  
* Modify `solo.rb`. In the first line, modify the variable `root` to
  point to the directory `chef` of the cloned git repository.
  
* Run the installation with `sudo chef-solo -j node.json -c solo.rb`

Run `sudo chef-solo -j node.json -c solo.rb`

## EC2

The directory `.chef` contains a simple `knife.rb` that must be
adjusted to be used with knife - see the comments in the file. Then
the application can be installed in the Amazon EC2 cloud.

To use it:
* Install Knife - see https://downloads.chef.io/chef-dk/
* Install the EC2 plug in - see
  https://github.com/chef/knife-ec2#installation
* Upload the cookbooks using  `knife cookbook upload -a`
* Upload the role with `knife role from file roles/tomcatserver.json`
* Now create a new server with   `knife ec2 server create -r
  'role[tomcatserver]' --identity-file ~/.ssh/<your-key>.pem`



