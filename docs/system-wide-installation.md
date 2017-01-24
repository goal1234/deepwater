## System-Wide Installation Setup and Requirements

### Setup

1. Create a build folder using: ``$ mkdir build``
		
### Java

We will install Oracle Java 8.

4. Verify installation using: ``$ java -version``

### Low-Level Libraries

1. Install Basic Linear Algebra Subroutines (BLAS) library using: ``$ sudo apt-get install libblas-dev``


### nVIDIA GPU Drivers

At the time of this writing, the latest version of nVIDIA drivers is 370. Instructions reflect this and are verified to work with this version throughout this document. If using a different version, edit the instruction commands to reflect the version that you are using.
    

  

   From here, DO NOT run a package manager update (i.e. ``$ sudo apt-get update``). Kernel updates will likely cause nVIDIA drivers to no longer function, as they are usually specific to kernel version and will result in a failed communication error.
   
### Monitoring GPU Usage

Run the following to monitor GPU usage:

		watch -d -n 1 nvidia-smi
		
### Disable Automatic System Updates

By default, Ubuntu applies automatic system updates, which as previously indicated, can cause the nVIDIA driver to fail. Consequently, we will stop auto system updates because after every kernel update, NVIDIA driver fails to communicate with system.

		$ sudo apt-get remove unattended-upgrades

### CUDA

At the time of the this writing, Deep Water is developed to support only CUDA 8. Instructions reflect this and are verified to work with this version throughout this document. If you are using a different version, edit the commands to reflect the version that you are using. 

**Note**: Before you begin, we recommend that you save the CUDA files in the **/build** directory created during setup.

1. Get CUDA Files:

	CUDA can be obtained directly from nVIDIA, which requires a registration. You can obtain these files from by going to the nVIDIA web site or using the CLI. 
	
	**Via Web Site**
	
	1. Download the CUDA Toolkit from [https://developer.nvidia.com/cuda-downloads](https://developer.nvidia.com/cuda-downloads). Note that the toolkit is approximately 1.4 GB and may take some time to download. 
	2. Select the following options for the target platform:
		- Operating System: Linux
		- Architecture: x86_64
		- Distribution: Ubuntu
		- Version: 16.04
		- Installer Type: runfile (local)
	
	**Via CLI**
	
	Run the following CLI commands to download CUDA files via the CLI.
	
		$ wget https://developer.nvidia.com/compute/cuda/8.0/prod/local_installers/cuda_8.0.44_linux-run

2. Install CUDA:

	Because the GPU driver is installed seperately, do not install drivers again through the CUDA installation process. Launch the installation, and answer the prompt questions. Edit to reflect your CUDA version. Note that you may not see all of these questions.
	
	1. Navigate to CUDA fles: ``~/build``
      
			Do you accept the previously read EULA?
			Do you want to install the OpenGL libraries?
	7. nvidia-xconfig
			Do you want to run nvidia-xconfig?

			Do you want to install a symbolic link at /usr/local/cuda?

3. Ignore Warning: You can ignore following warning which is displayed after CUDA installation as we

		
4. Exit root: ``exit``

### cuDNN

**Note**: Before you begin, we recommended that you save the cuDNN files in the /build directory created during setup.

1. Get cuDNN files. cuDNN can be obtained directly from nVidia.
   

### C and C++ Compilers

Throughout the installation process you may need various versions of C and C++ compilers. You can

**gcc**

4. Verify all installed versions of gcc: ``$ ls -l /usr/bin/gcc*``
	You should see entries for gcc-5 and gcc-4.8 similar to the following. Note that the default of gcc is specified as a symbolic link.
	



4. Verify all installed versions of g++: ``$ ls -l


### Maven

1. Install Maven: ``$ sudo apt-get install maven``

### Bazel

Bazel is required to build TensorFlow.

1. Download installer script (recommend into the build directory):

	

### Python Development Tools

1. Install header files and static library for Python: ``$ sudo apt-get install python-dev``

### R

Install R by running the following commands:

	$ sudo echo ``deb http://cran.rstudio.com/bin/linux/ubuntu xenial/'' | sudo tee -a /etc/apt/sources.list

The R development tools (devtools) requires OpenSSL, which can be installed using the following commands:

1. Install OpenSSL flavor and XML library: ``$ sudo apt-get install libcurl4-openssl-dev libxml2-dev``

### SWIG

SWIG is required to build H2O and can be installed by running the following command:

	$ sudo apt-get install swig

### Node.js

Node.js is required to build H2O and can be installed by running the following commands:

1. Get repository: ``$ curl -sL https://deb.nodesource.com/setup 4.x | sudo -E bash -``

### Alternatives

Throughout the installation process you may need various versions of C and C++ compilers. You can manage the version is used manually, or you can use alternatives.

#### Alternatives for C and C++ Compilers

**gcc C compiler**

Run the following commands to use alternatives for the C compiler:


### Virtual Environments

Install a virtual environment using the following command: ``$sudo apt-get install virtualenv``